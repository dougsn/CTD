package com.example.esporteHQL.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Treinador")
public class TreinadorEntity {

    @Id
    @SequenceGenerator(name = "treinador_sequence", sequenceName = "treinador_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String nome;
    private Integer idade;

    @OneToMany(mappedBy = "treinadorModel", fetch = FetchType.LAZY)
    private Set<JogadorEntity> jogadores = new HashSet<JogadorEntity>();

    public TreinadorEntity() {
    }

    public TreinadorEntity(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
