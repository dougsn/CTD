package com.example.Injecao_Dependencia.controller;


import com.example.Injecao_Dependencia.entity.LivroEntity;
import com.example.Injecao_Dependencia.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private ILivroService iLivroService;

    @GetMapping("/todos")
    public List<LivroEntity> buscarTodosLivros(){
        return iLivroService.buscarTodosLivros();
    }


}
