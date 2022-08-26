package com.example.ClinicaFixacao.controller;

import com.example.ClinicaFixacao.dao.ConfiguracaoJDBC;
import com.example.ClinicaFixacao.dao.imp.UsuarioIDaoH2Imp;
import com.example.ClinicaFixacao.model.UsuarioModel;
import com.example.ClinicaFixacao.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService(new UsuarioIDaoH2Imp(new ConfiguracaoJDBC()));

    @PostMapping("/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.salvar(usuarioModel);
    }

//    @GetMapping("/{id}")
//    public UsuarioModel buscar(@PathVariable Integer id){
//        return usuarioService.buscar(id);
//    }

}
