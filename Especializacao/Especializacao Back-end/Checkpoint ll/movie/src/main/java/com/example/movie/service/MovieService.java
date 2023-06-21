package com.example.movie.service;

import com.example.movie.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    void save(MovieDTO dto);
    List<MovieDTO> findByGenre(String genre);
}
