package com.catalog.catalog.controller;

import com.catalog.catalog.entity.MovieDTO;
import com.catalog.catalog.service.CatalogService;
import com.catalog.catalog.service.impl.CatalogServiceImpl;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
