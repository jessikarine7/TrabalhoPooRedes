package com.ifal.mercado.produtos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntidade;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepositorio produtoRepositorio;

    @GetMapping
    Iterable<Produto> read() {
        try {
            return produtoRepositorio.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @GetMapping("/{id}")
    public ResponseEntidade<Produto> find(@PathVariable Long id) {
        try {
            Optional<Produto> optionalProduto = produtoRepositorio.findById(id);
            return optionalProduto.map(ResponseEntidade::ok).orElse(ResponseEntidade.notFound().build());
        } catch (Exception e) {
            throw e;
        }
    }

    @PostMapping
    public ResponseEntidade<Produto> create(@RequestBody Produto produto) {
        try {
            Produto createdProduto = produtoRepositorio.save(produto);
            return ResponseEntidade.ok(createdProduto);
        } catch (Exception e) {
            throw e;
        }
    }

    @PutMapping("/{id}")
    public ResponseEntidade<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
        try {
            if (!produtoRepositorio.existsById(id)) {
                return ResponseEntidade.notFound().build();
            }

            Produto updatedProduto = produtoRepositorio.save(produto);
            return ResponseEntidade.ok(updatedProduto);
        } catch (Exception e) {
            throw e;
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntidade<Void> delete(@PathVariable Long id) {
        try {
            if (!produtoRepositorio.existsById(id)) {
                return ResponseEntidade.notFound().build();
            }

            produtoRepositorio.deleteById(id);
            return ResponseEntidade.noContent().build();
        } catch (Exception e) {
            throw e;
        }
    }
}
