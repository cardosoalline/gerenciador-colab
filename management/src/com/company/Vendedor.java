package com.company;

public class Vendedor {

    private String nome;
    private String documento;


    private Endereco Endereco;

    private Double valorSalario;
    private Double valorBonificacao;

    public Vendedor() {
    }

    public Vendedor(String nome, String documento, com.company.Endereco endereco, Double valorSalario) {
        this.nome = nome;
        this.documento = documento;
        Endereco = endereco;
        this.valorSalario = valorSalario;
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

    public com.company.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(com.company.Endereco endereco) {
        Endereco = endereco;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }
}
