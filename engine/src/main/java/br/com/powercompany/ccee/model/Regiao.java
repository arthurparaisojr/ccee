package br.com.powercompany.ccee.model;

public class Regiao {
    private String sigla;
    private double[] geracao;
    private double[] compra;

    public Regiao(String sigla, double[] geracao, double[] compra) {
        this.sigla = sigla;
        this.geracao = geracao;
        this.compra = compra;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double[] getGeracao() {
        return geracao;
    }

    public void setGeracao(double[] geracao) {
        this.geracao = geracao;
    }

    public double[] getCompra() {
        return compra;
    }

    public void setCompra(double[] compra) {
        this.compra = compra;
    }
}
