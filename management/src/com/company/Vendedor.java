package com.company;

public class Vendedor extends FuncionarioCLT{


    private Double valorBonificacao;

    public Vendedor() {

    }

    public Vendedor(String nome, String documento, com.company.Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", Endereco=" + Endereco +
                ", valorSalario=" + valorSalario +
                ", valorBonificacao=" + valorBonificacao +

                '}';
    }
}
