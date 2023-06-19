package com.catalog.catalog.service;

import com.catalog.catalog.entity.MovieDTO;

import java.util.List;

public interface CatalogService {
    List<MovieDTO> findByGenero(String genero);

    List<MovieDTO> findAll();

    List<MovieDTO> findAllListener();
}
