package com.company.model;

public class Gerente implements CalculaBonificacao {

    private String nome;
    private String documento;
    private Endereco Endereco;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Double valorBonificacao;
    private Double valorRemuneracao;

    public Gerente() {
    }

    public Gerente(String nome, String documento, com.company.model.Endereco endereco, Integer horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.documento = documento;
        Endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }


    @Override
    public void calcBonificacao(Double percentBonifica) {
        this.valorBonificacao = this.valorRemuneracao * percentBonifica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public com.company.model.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(com.company.model.Endereco endereco) {
        Endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    public void calculaRemunera() {
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", Endereco=" + Endereco.getRua() +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorBonificacao=" + valorBonificacao +
                ", valorRemuneracao=" + valorRemuneracao +
                '}';
    }
}
