package com.example.Clinica.service.imp;

import com.example.Clinica.ConfiguracaoJDBC;
import com.example.Clinica.Dao.IDao;
import com.example.Clinica.Dao.UsuarioDaoH2;
import com.example.Clinica.model.Usuario;
import com.example.Clinica.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService{

    UsuarioDaoH2 usuarioDaoH2 = new UsuarioDaoH2(new ConfiguracaoJDBC());



    @Override
    public List<Usuario> cadastrar() {

        List<Usuario> listaUsuario = new ArrayList<>();


        Usuario usuario1 = new Usuario("Douglas","douglas@gmail.com","1234","Administrador");
        Usuario usuario2 = new Usuario("Daniel","daniel@gmail.com","5678","Moderador");

        usuarioDaoH2.cadastrar(usuario1);
        usuarioDaoH2.cadastrar(usuario2);

        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);

        return listaUsuario;

    }

    @Override
    public Usuario buscar(Integer id) {
        return usuarioDaoH2.buscar(id);
    }

    @Override
    public String deletar(Integer id) {
        usuarioDaoH2.deletar(id);
        return "Usuario deletado";
    }

}
