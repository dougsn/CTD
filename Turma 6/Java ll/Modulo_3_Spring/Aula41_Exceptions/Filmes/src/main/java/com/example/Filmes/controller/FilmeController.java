package com.example.Filmes.controller;

import com.example.Filmes.entities.FilmeEntities;
import com.example.Filmes.exceptions.ResourceNotFoundException;
import com.example.Filmes.service.FilmeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @PostMapping
    public ResponseEntity<FilmeEntities> salvar(@RequestBody FilmeEntities filmeEntities){
        return ResponseEntity.ok(filmeService.salvar(filmeEntities));
    }

    @GetMapping
    public ResponseEntity<List<FilmeEntities>> buscarTodos(){
        return ResponseEntity.ok(filmeService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmeEntities> buscarFilmes(@PathVariable Integer id) throws ResourceNotFoundException {
        try{
            return ResponseEntity.ok(filmeService.buscarId(id));
        }catch (Exception e){
            throw  new ResourceNotFoundException("Não foi encontrado para buscar o filme de ID: " + id);
        }


    }

    @PutMapping
    public ResponseEntity<FilmeEntities> atualizarFilmes(@RequestBody FilmeEntities filmeEntities){
        return ResponseEntity.ok(filmeService.atualizar(filmeEntities));
    }

    @DeleteMapping("/{ìd}")
    public ResponseEntity deletar(@PathVariable Integer id) throws ResourceNotFoundException {
        try{
            filmeService.deletar(id);
            return  ResponseEntity.ok("Deletado");
        }catch (Exception e){
            throw  new ResourceNotFoundException("Não foi encontrado o filme de ID: " + id);
        }

    }




}
