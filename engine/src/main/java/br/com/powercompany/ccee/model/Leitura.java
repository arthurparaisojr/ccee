package br.com.powercompany.ccee.model;

import java.sql.Date;

public class Leitura {
    public Leitura(int codigoAgente, Date data, Regiao[] regiao) {
        this.setCodigoAgente(codigoAgente);
        this.setData(data);
        this.setRegiao(regiao);
    }

    private int codigoAgente;
    private Date data;
    private Regiao[] regiao;

    public int getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(int codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Regiao[] getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao[] regiao) {
        this.regiao = regiao;
    }
}
