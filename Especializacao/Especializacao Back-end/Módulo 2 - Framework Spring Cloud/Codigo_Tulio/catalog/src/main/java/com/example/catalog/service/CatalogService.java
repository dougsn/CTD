package com.example.catalog.service;

import com.example.catalog.dto.MovieDTO;

import java.util.List;

public interface CatalogService {
    List<MovieDTO> findByGenre(String genre);

    void save(MovieDTO dto);
}
