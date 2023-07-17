package utilitario;

import entities.Pessoa;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionarPessoa(Pessoa pessoa) {
        double valorImpostosCalculados = pessoa.calcularImposto();

        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), valorImpostosCalculados);

        valorTotalImpostos += valorImpostosCalculados;

    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
