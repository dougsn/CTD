package com.example.Ecommerc.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // criando o getter por anotation
@Setter  // criando o setter por anotation
@AllArgsConstructor // criando o construtor com todos os argumentos que ele tem
@NoArgsConstructor // criando o construtor sem argumento


public class Produto {

    private int id;
    private String nome;
    private double valor;


}
