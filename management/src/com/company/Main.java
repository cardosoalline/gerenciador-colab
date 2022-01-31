package com.company;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua das Couves", "12", "Pomar");
       Vendedor vendedor = new Vendedor("nome", "12121212", endereco, 1000.00);
       // vendedor.setNome("teste");

      System.out.println(vendedor);

        OperadorCaixa op = new OperadorCaixa("oper", "1212", endereco, 1200.00);
        System.out.println(op);
    }
}
