package com.digital.bank.api.controller;

import com.digital.bank.api.dto.ProdutoDTO;
import com.digital.bank.api.dto.RepositorioDTO;
import com.digital.bank.api.service.RepositorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/repositorio")
public class RepositorioController {

    @Autowired
    private RepositorioService service;

    @GetMapping
    public ResponseEntity<RepositorioDTO> getAll() {
        return ResponseEntity.ok(service.findRepositoryByProduct());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProdutoDTO>> getProductById(@PathVariable Long id) {
        try {
            Optional<ProdutoDTO> prod = service.findRepositorioByIdProduct(id);
            if (prod.isPresent()) return ResponseEntity.ok(prod);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Optional<ProdutoDTO>> addProduct(@RequestBody ProdutoDTO produto){
        try {
            Optional<ProdutoDTO> prod = service.addProductByRepository(produto);
            return new ResponseEntity<>(prod, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
