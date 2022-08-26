package com.example.Clinica2.service;

import com.example.Clinica2.dao.IDao;
import com.example.Clinica2.model.UsuarioModel;

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

    public String deletar(Integer id){
       return usuarioModelIDao.deletar(id);
    }


}
