package com.example.ORMParte1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity // Passando o nome da tabela do banco estudantes, pertence a essa entidade.
public class EstudantesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Fazendo a relação com o banco de dados.
    private Long id;
    private String codigoEstudante;
    private String nome;
    private String sobrenome;
}
