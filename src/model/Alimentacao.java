package model;

public class Alimentacao extends Despesa {
    public Alimentacao(String descricao, double valor, String dataVencimento) {
        super(descricao, valor, dataVencimento, "Alimentação");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Alimentação - " + descricao + " | Valor: R$" + valor);
    }
}