package com.example.catalog.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieDTO {
    private Long id;
    private String description;
    private String genre;
}
