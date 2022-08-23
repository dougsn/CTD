package com.example.Usuario.service;

import com.example.Usuario.model.Usuario;

public class UsuarioService {

    public Usuario criarUsuario(String nome, int idade) {
        return new Usuario(nome, idade);

//        Usuario usuario = new Usuario(nome, idade);
//        return usuario;
    }

}
