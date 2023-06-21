package com.example.movie.dto;

import com.example.movie.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {
    private Long id;
    private String description;
    private String genre;

    public MovieDTO(Movie entity) {
        setId(entity.getId());
        setDescription(entity.getDescription());
        setGenre(entity.getDescription());
    }
}
