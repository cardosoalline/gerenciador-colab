package com.company.model;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {


    private Double valorBonificacao;

    public Vendedor() {

    }

    public Vendedor(String nome, String documento, com.company.model.Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public void calcBonificacao(Double percentBonifica) {
        this.valorBonificacao = super.getValorSalario() * percentBonifica;
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
