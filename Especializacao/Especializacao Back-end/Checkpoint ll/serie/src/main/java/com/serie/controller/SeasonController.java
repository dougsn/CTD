package com.serie.controller;

import com.serie.entity.Season;
import com.serie.service.impl.SeasonService;
import com.serie.service.impl.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/season")
public class SeasonController {

    @Autowired
    private SeasonService service;

    
    @PostMapping
    public ResponseEntity<Optional<Season>> add (@RequestBody Season season) {
        Optional<Season> newSeason = service.add(season);
        if (newSeason.isPresent()) {
            return new ResponseEntity<>(newSeason, HttpStatus.CREATED);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Season>> findById(@PathVariable Long id){
        Optional<Season> season = service.findById(id);
        if (season.isPresent()) {
            return ResponseEntity.ok(season);
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }
    
    @GetMapping
    public ResponseEntity<List<Season>> findAll() {
        List<Season> list = service.findAll();
        return ResponseEntity.ok(list);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Season>> hardDelete(@PathVariable Long id) {
        if (service.findById(id).isPresent() && service.hardDelete(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

}
