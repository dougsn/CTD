package com.example.Fixture.controller;

import com.example.Fixture.entity.TorneioEntity;
import com.example.Fixture.service.TorneioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneio")
public class TorneioController {

    private TorneioService torneioService;

    public TorneioController(TorneioService torneioService) {
        this.torneioService = torneioService;
    }

    @PostMapping()
    public TorneioEntity salvar(@RequestBody TorneioEntity torneio){
        return torneioService.salvar(torneio);
    }

    @GetMapping()
    public List<TorneioEntity> buscarTodos(){
        return torneioService.buscarTodos();
    }


}
