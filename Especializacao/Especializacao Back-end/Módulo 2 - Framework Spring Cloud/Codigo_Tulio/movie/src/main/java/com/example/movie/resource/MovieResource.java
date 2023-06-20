package com.example.movie.resource;

import com.example.movie.dto.MovieDTO;
import com.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity<Void> saveEntity(@RequestBody MovieDTO dto) {
        service.save(dto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTO>> findByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(service.findByGenre(genre));
    }
}
