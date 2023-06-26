package com.catalog.catalog.controller;

import com.catalog.catalog.entity.Catalog;
import com.catalog.catalog.entity.MovieDTO;
import com.catalog.catalog.entity.SerieDTO;
import com.catalog.catalog.service.CatalogService;
import com.catalog.catalog.service.impl.CatalogServiceImpl;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl catalog;

    @PostMapping("/movie")
    public void add(@RequestBody MovieDTO dto) {
        catalog.add(dto);
    }

    @GetMapping("/movie/{genero}")
    public ResponseEntity<List<MovieDTO>> findByGenero(@PathVariable String genero) {
        List<MovieDTO> list = catalog.findByGenero(genero);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> findAll() {
        List<MovieDTO> list = catalog.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/serie")
    public ResponseEntity<List<SerieDTO>> findAllSeries() {
        List<SerieDTO> list = catalog.allSeries();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/serie/{genero}")
    public ResponseEntity<List<SerieDTO>> serieByGenero(@PathVariable String genero) {
        List<SerieDTO> list = catalog.serieByGenero(genero);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/{genero}")
    public ResponseEntity<Void> addCatalog(@PathVariable String genero) {
        catalog.sendCatalogo(genero);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Catalog>> allCatalog() {
        return ResponseEntity.ok(catalog.findAllCatalogs());
    }

}
