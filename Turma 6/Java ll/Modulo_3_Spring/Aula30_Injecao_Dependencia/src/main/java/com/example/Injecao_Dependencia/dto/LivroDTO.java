package com.example.Injecao_Dependencia.dto;


import com.example.Injecao_Dependencia.entity.LivroEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroDTO {

    // A camada DTO, pega as informações das classes e abstraí, para mostrar o que é apenas necessário. Por isso instanciamos a classe LivroEntity

    private String titulo;
    private String autor;

    public LivroDTO(LivroEntity livroEntity){
        this.titulo = livroEntity.getTitulo();
        this.autor = livroEntity.getAutor();
    }

}
