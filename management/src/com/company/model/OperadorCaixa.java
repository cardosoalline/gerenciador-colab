package com.company.model;

public class OperadorCaixa extends FuncionarioCLT {

    public OperadorCaixa() {
    }

    public OperadorCaixa(String nome, String documento, com.company.model.Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public String toString() {
        return "Operador de Caixa {" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", Endereco=" + Endereco +
                ", valorSalario=" + valorSalario +
                '}';
    }
}
