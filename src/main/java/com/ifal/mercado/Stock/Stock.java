package com.ifal.mercado.Stock;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import com.ifal.mercado.shared.Entidade;

public class Stock extends Entidade {
    @Id
    private Long id;

    @Column()
    private String espaco;

    public void setSpace(String espaco) {
        this.espaco = espaco;
    }
}