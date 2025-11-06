package model;

public class DespesaEventual extends Despesa {
    public DespesaEventual(String descricao, double valor, String dataVencimento) {
        super(descricao, valor, dataVencimento, "Eventual");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eventual - " + descricao + " | Valor: R$" + valor);
    }
}