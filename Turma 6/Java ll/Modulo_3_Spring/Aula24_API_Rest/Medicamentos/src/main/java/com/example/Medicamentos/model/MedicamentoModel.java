package com.example.Medicamentos.model;

public class MedicamentoModel {

    private Integer id;
    private String nome;
    private String laboratorio;
    private Integer quantidade;
    private Double preco;

    public MedicamentoModel(Integer id, String nome, String laboratorio, Integer quantidade, Double preco) {
        this.id = id;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public MedicamentoModel( String nome, String laboratorio, Integer quantidade, Double preco) {
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public MedicamentoModel(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuatiade(Integer quatiade) {
        this.quantidade = quatiade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "MedicamentoModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", quatiade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
