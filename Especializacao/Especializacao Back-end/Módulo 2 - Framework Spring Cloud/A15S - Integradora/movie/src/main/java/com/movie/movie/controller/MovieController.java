package com.movie.movie.controller;

import com.movie.movie.entity.Movie;
import com.movie.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/movie")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> findAll() {
        try {
            List<Movie> list = movieService.findAll();
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listener")
    public ResponseEntity<List<Movie>> findListener() {
        try {
            List<Movie> list = movieService.findAllListener();
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("get/{id}")
    public ResponseEntity<Optional<Movie>> findById(@PathVariable Long id) {
        try {
            Optional<Movie> movie = movieService.findById(id);
            if (movie.isPresent()) return ResponseEntity.ok(movie);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return null;
    }

    @GetMapping("/{genero}")
    public ResponseEntity<List<Movie>> findByGenero(@PathVariable String genero){
        try {
            List<Movie> list = movieService.findByGenero(genero);
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity addMovie (@RequestBody Movie movie) {
        try {
            if (movie != null) {
                Optional<Movie> newMovie = movieService.addMovie(movie);
                if (newMovie.isPresent()) return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
            }
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return null;
    }

    @PutMapping
    public ResponseEntity<Optional<Movie>> updateMovie (@RequestBody Movie movie) {
        try {
            if (movie != null) {
                Optional<Movie> updateMovie = movieService.updateMovie(movie);
                if (updateMovie.isPresent()) return ResponseEntity.ok(updateMovie);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Movie>> hardDeleteMovie (@PathVariable Long id) {
        try {
            if (movieService.findById(id).isPresent() && movieService.hardDeleteMovie(id)) return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return null;
    }

}
