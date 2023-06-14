package com.pessoa.controller;

import com.pessoa.entity.Pessoa;
import com.pessoa.service.impl.PessoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin("*")
public class PessoaController {

    @Autowired
    private PessoaServiceImpl service;

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        try {
            List<Pessoa> p = service.findAll();
            return ResponseEntity.ok().body(p);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pessoa>> findById(@PathVariable Long id) {
        try {
            Optional<Pessoa> p = service.findById(id);
            if (p.isPresent()) return ResponseEntity.ok(p);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Optional<Pessoa>> add (@RequestBody Pessoa pessoa) {
        try {
            Optional<Pessoa> p = service.save(pessoa);
            if (p.isPresent()) return new ResponseEntity<>(p, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        return null;
    }

}
