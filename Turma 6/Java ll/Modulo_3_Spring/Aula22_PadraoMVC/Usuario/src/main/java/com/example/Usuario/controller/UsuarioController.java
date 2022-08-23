package com.example.Usuario.controller;


import com.example.Usuario.model.Usuario;
import com.example.Usuario.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    // Iniciando as solicitações
    @GetMapping("/") // Página root/inicial
    public Usuario criarUsuario(){
        return usuarioService.criarUsuario("Douglas",23);
    }

    @GetMapping("/novoUsuario")
    public Usuario criarUsuario2(){
        return usuarioService.criarUsuario("Rodrigo",34);
    }

}
