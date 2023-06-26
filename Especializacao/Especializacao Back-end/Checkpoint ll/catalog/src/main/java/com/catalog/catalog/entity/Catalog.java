package com.catalog.catalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document("catalog")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Catalog {
    @Id
    private String genre;
    private List<MovieDTO> movies;
    private List<SerieDTO> series;

}
