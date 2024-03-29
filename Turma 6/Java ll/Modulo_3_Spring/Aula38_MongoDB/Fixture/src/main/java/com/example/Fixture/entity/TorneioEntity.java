package com.example.Fixture.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "torneios")
public class TorneioEntity {
    @Id
    private long id;
    private String nome, pais;
}