package com.example.ClinicaFixacao.service;

import com.example.ClinicaFixacao.dao.IDao;
import com.example.ClinicaFixacao.model.UsuarioModel;
import org.springframework.stereotype.Service;

public class UsuarioService {

    private IDao<UsuarioModel> usuarioModelIDao;

    public UsuarioService(IDao<UsuarioModel> usuarioModelIDao) {
        this.usuarioModelIDao = usuarioModelIDao;
    }

    public UsuarioModel salvar(UsuarioModel usuarioModel){
        return usuarioModelIDao.salvar(usuarioModel);
    }

    public UsuarioModel buscar(Integer id){
        return usuarioModelIDao.buscar(id);
    }

}
