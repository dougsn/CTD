package com.example.Dentista.controller;


import com.example.Dentista.model.Dentista;
import com.example.Dentista.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Informando ao Spring que este é o nosso controlador.
@RequestMapping("dentista") // Adicionando a nossa URL, que é o /dentista.
public class DentistaController {

    private final DentistaService dentistaService;

    @Autowired // Trata-se da conexão com a camada model com a camada controller.
    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }


    @GetMapping
    public List<Dentista> getDentista(){
        return dentistaService.listaDentista();
    }

}
