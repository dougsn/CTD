package com.serie.controller;

import com.serie.entity.Chapter;
import com.serie.service.impl.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chapter")
public class ChapterController {

    @Autowired
    private ChapterService service;


    @PostMapping
    public ResponseEntity<Optional<Chapter>> add (@RequestBody Chapter chapter) {
        Optional<Chapter> newChapter = service.add(chapter);
        if (newChapter.isPresent()) {
            return new ResponseEntity<>(newChapter, HttpStatus.CREATED);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Chapter>> findById(@PathVariable Long id){
        Optional<Chapter> chapter = service.findById(id);
        if (chapter.isPresent()) {
            return ResponseEntity.ok(chapter);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Chapter>> findAll() {
        List<Chapter> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Chapter>> hardDelete(@PathVariable Long id) {
        if (service.findById(id).isPresent() && service.hardDelete(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
