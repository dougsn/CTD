package com.catalog.catalog.controller;

import com.catalog.catalog.entity.MovieDTO;
import com.catalog.catalog.service.CatalogService;
import com.catalog.catalog.service.impl.CatalogServiceImpl;
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
    public ResponseEntity<List<MovieDTO>> findByGenero(@PathVariable String genero) {
        List<MovieDTO> list = catalog.findByGenero(genero);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> findAll() {
        List<MovieDTO> list = catalog.findAll();
        return ResponseEntity.ok(list);
    }

}
