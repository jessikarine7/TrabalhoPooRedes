package com.ifal.mercado.shared;

import java.sql.Date;

public class Entidade {
    private Date criadoEm = null;
    private Date atualizadoEm;
    private Date deletadoEm;

    public Date getCriadoEM() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Date getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(Date atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    public Date getDeletadoEm() {
        return deletadoEm;
    }

    public void setDeletadoEm(Date deletadoEm) {
        this.deletadoEm = deletadoEm;
    }
}
