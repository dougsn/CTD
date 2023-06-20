package com.example.catalog.resource;

import com.example.catalog.dto.MovieDTO;
import com.example.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private CatalogService service;

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTO>> findByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(service.findByGenre(genre));
    }

    @PostMapping
    public ResponseEntity<Void> saveMovieDTO(@RequestBody MovieDTO dto) {
        service.save(dto);
        return ResponseEntity.noContent().build();
    }
}
