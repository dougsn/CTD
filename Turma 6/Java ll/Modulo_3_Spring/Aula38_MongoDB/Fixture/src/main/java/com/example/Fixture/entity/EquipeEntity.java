package com.example.Fixture.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "torneios")
public class EquipeEntity {
    @Id
    private long id;
    private String nome, pais;

}
