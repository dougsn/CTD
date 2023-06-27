package com.serie.controller;

import com.serie.entity.Serie;
import com.serie.service.impl.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @Autowired
    private SerieService service;

    
    @PostMapping
    public ResponseEntity<Optional<Serie>> add (@RequestBody Serie serie) {
        Optional<Serie> newSerie = service.add(serie);
        if (newSerie.isPresent()) {
            return new ResponseEntity<>(newSerie, HttpStatus.CREATED);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{genero}")
    public ResponseEntity<List<Serie>> findByGenero(@PathVariable String genero) {
        List<Serie> list = service.findByGenero(genero);
        return ResponseEntity.ok(list);
    }
    
//    @GetMapping("byId/{id}")
//    public ResponseEntity<Optional<Serie>> findById(@PathVariable Long id){
//        Optional<Serie> serie = service.findById(id);
//        if (serie.isPresent()) {
//            return ResponseEntity.ok(serie);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
    
    @GetMapping
    public ResponseEntity<List<Serie>> findAll() {
        List<Serie> list = service.findAll();
        return ResponseEntity.ok(list);
    }
    
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Optional<Serie>> hardDelete(@PathVariable Long id) {
//        if (service.findById(id).isPresent() && service.hardDelete(id)) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
    

}
