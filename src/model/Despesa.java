package model;

import java.io.Serializable;

public abstract class Despesa implements Pagavel, Serializable {
    protected String descricao;
    protected double valor;
    protected String dataVencimento;
    protected String categoria;
    protected boolean paga;
    protected static int contador = 0;

    public Despesa(String descricao, double valor, String dataVencimento, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.categoria = categoria;
        this.paga = false;
        contador++;
    }
    
    public Despesa(String descricao, double valor) {
        this(descricao, valor, "Sem data", "Geral");
    }

    public abstract void exibirDetalhes();

    @Override
    public void pagar(double valor, String dataPagamento) {
        if (!paga) {
        this.paga = true;
            System.out.println("Despesa paga no valor de R$" + valor + " em " + dataPagamento);
        } else {
            System.out.println("Esta despesa já foi paga.");
        }
    }

    public boolean isPaga() {
        return paga;
    }

    public String getCategoria() {
        return categoria;
    }

    public String toString() {
        return descricao + ";" + valor + ";" + dataVencimento + ";" + categoria + ";" + paga;
    }
}