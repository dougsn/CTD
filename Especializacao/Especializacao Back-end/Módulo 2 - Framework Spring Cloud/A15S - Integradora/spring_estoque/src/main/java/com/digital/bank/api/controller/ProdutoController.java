package com.digital.bank.api.controller;

import com.digital.bank.api.entity.Produto;
import com.digital.bank.api.service.impl.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoServiceImpl service;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        try {
            List<Produto> prod = service.findAll();
            return ResponseEntity.ok().body(prod);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> findById(@PathVariable Long id) {
        try {
            Optional<Produto> prod = service.findById(id);
            if (prod.isPresent()) return ResponseEntity.ok(prod);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return null;
    }


    @PostMapping
    public ResponseEntity<Optional<Produto>> add (@RequestBody Produto produto) {
        try {
            Optional<Produto> prod = service.save(produto);
            if (prod.isPresent()) return new ResponseEntity<>(prod, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        return null;
    }


}
