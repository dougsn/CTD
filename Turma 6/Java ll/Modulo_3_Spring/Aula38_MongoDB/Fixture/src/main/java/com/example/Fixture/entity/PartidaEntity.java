package com.example.Fixture.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "partidas")
public class PartidaEntity {

    @Id

    private long id;
    private String resultado;
    private EstadoEntity estado; // Pegando o estado do ENUM
    @Field(name = "equipe_local") // Dando nome da "Linha" no banco de dados MongoDB
    private EquipeEntity equipeLocal;
    @Field(name = "equipe_visitante") // Dando nome da "Linha" no banco de dados MongoDB
    private EquipeEntity equipeVisitante;


}
