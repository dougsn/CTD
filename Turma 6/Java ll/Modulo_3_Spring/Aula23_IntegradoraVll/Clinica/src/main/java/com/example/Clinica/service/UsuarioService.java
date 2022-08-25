package com.example.Clinica.service;

import com.example.Clinica.Dao.IDao;
import com.example.Clinica.model.Usuario;

import java.util.List;

public interface UsuarioService {


    public List<Usuario> cadastrar();

    public Usuario buscar(Integer id);

    public String deletar (Integer id);

}
