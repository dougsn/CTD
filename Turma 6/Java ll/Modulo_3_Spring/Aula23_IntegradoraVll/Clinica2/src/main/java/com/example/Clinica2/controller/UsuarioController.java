package com.example.Clinica2.controller;

import com.example.Clinica2.dao.ConfiguracaoJDBC;
import com.example.Clinica2.dao.imp.UsuarioDaoH2Imp;
import com.example.Clinica2.model.UsuarioModel;
import com.example.Clinica2.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService(new UsuarioDaoH2Imp(new ConfiguracaoJDBC()));

    @PostMapping("/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.salvar(usuarioModel);
    }

    @GetMapping("/buscar/{id}")
    public UsuarioModel buscar(@PathVariable Integer id){
        return usuarioService.buscar(id);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id){
        return usuarioService.deletar(id);
    }




}
