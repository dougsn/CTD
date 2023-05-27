package com.catalog.catalog.service;

import com.movie.movie.entity.Movie;

import java.util.List;

public interface CatalogService {
    List<Movie> findByGenero(String genero);

    List<Movie> findAll();
}
