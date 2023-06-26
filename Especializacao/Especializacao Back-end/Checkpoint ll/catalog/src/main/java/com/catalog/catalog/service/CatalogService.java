package com.catalog.catalog.service;

import com.catalog.catalog.entity.MovieDTO;
import com.catalog.catalog.entity.SerieDTO;

import java.util.List;

public interface CatalogService {
    List<MovieDTO> findByGenero(String genero);

    List<MovieDTO> findAll();

    List<SerieDTO> serieByGenero(String genero);

    List<SerieDTO> allSeries();

}
