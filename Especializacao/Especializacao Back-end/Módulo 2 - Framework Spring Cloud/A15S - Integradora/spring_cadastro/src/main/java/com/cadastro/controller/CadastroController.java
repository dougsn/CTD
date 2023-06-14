package com.cadastro.controller;

import com.cadastro.dto.PessoaDTO;
import com.cadastro.service.impl.CadastroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroServiceImpl service;


    @GetMapping
    public ResponseEntity<List<PessoaDTO>> getAll() {
        return ResponseEntity.ok(service.findAllPessoas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PessoaDTO>> findById(@PathVariable Long id){
        try {
            Optional<PessoaDTO> p = service.findPessoaById(id);
            if (p.isPresent()) return ResponseEntity.ok(p);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Optional<PessoaDTO>> addPessoa(@RequestBody PessoaDTO pessoa){
        try {
            Optional<PessoaDTO> p = service.addPessoa(pessoa);
            return new ResponseEntity<>(p, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
