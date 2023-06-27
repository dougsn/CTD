package com.catalog.catalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerieDTO {
    private String id;
    private String name;
    private String genre;
    private List<SeasonDTO> seasons;
}
