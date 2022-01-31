package com.company;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua das Couves", "12", "Pomar");
        Vendedor vendedor = new Vendedor("nome", "12121212", endereco, 1000.00);
        vendedor.calcBonificacao(0.2);

        // vendedor.setNome("teste");

        System.out.println(vendedor);

        OperadorCaixa op = new OperadorCaixa("oper", "1212", endereco, 1200.00);
        System.out.println(op);

        Gerente ger = new Gerente("Gerente", "34342", endereco, 56, 12.50);
        ger.calculaRemunera();
        ger.calcBonificacao(0.2);
        System.out.println(ger);
    }
}
