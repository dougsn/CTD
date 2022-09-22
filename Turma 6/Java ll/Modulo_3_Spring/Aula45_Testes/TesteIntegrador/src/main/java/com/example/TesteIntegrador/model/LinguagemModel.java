package com.example.TesteIntegrador.model;

public class LinguagemModel {
    private String name;
    private Boolean seOrientadaAoObjeto;

    public LinguagemModel(String name, Boolean seOrientadaAoObjeto) {
        this.name = name;
        this.seOrientadaAoObjeto = seOrientadaAoObjeto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSeOrientadaAoObjeto() {
        return seOrientadaAoObjeto;
    }

    public void setSeOrientadaAoObjeto(Boolean seOrientadaAoObjeto) {
        this.seOrientadaAoObjeto = seOrientadaAoObjeto;
    }
}
