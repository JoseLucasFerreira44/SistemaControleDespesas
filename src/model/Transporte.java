package model;

public class Transporte extends Despesa {
    public Transporte(String descricao, double valor, String dataVencimento) {
        super(descricao, valor, dataVencimento, "Transporte");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Transporte - " + descricao + " | Valor: R$" + valor);
    }
}