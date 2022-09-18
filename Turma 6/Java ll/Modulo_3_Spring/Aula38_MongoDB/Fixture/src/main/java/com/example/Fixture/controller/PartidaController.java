package com.example.Fixture.controller;


import com.example.Fixture.entity.EstadoEntity;
import com.example.Fixture.entity.PartidaEntity;
import com.example.Fixture.sequence.SequenceDao;
import com.example.Fixture.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partida")
public class PartidaController {
    private PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @PostMapping
    public PartidaEntity salvar(@RequestBody PartidaEntity partida){
        return partidaService.adicionar(partida);
    }

    @GetMapping()
    public List<PartidaEntity> buscarTodos(){
        return partidaService.listarTodos();
    }

    @GetMapping("/ao-vivo")
    public List<PartidaEntity> partidasAoVivo(){
        return partidaService.partidaAoVivo();
    }

}
