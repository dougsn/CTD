package com.example.Injecao_Dependencia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivroEntity {

    private int id;
    private String titulo;
    private String autor;

}
