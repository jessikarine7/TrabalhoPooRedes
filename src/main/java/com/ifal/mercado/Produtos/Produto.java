package com.ifal.mercado.Produtos;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import com.ifal.mercado.shared.Entidade;

public class Produto extends Entidade {
    @Id
    private Long id;

    @Column()
    private String nome;

    @Column()
    private Double preco;

    @Column()
    private Double peso;

    @Column()
    private String descricao;

    @Column()
    private String marca;

    @Column()
    private Date dataValidade;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}
