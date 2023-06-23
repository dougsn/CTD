package com.movie.movie.repository;

import com.movie.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IMovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGenero(String genero);
    Optional<Movie> findByName(String name);
}
