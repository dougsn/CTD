package com.catalog.catalog.controller;

import com.catalog.catalog.service.impl.CatalogServiceImpl;
import com.movie.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl catalog;

    @GetMapping
    public String find() {

        return "Hello World";
    }

    @GetMapping("/{genero}")
    public ResponseEntity<List<Movie>> findByGenero(@PathVariable String genero) {
        List<Movie> list = catalog.findByGenero(genero);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> findAll() {
        List<Movie> list = catalog.findAll();
        return ResponseEntity.ok(list);
    }

}
