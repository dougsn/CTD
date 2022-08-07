package Aula08_FacadePattern.ExercicioPG.services.impl;

import Aula08_FacadePattern.ExercicioPG.model.Usuario;

public class AuthenticationService {


    public void validateUserAndPassword(String id, String senha){

        Usuario usuario = new Usuario(id, senha);

        if(id.equals(usuario.getId()) && senha.equals(usuario.getSenha())){
            System.out.println("Usuário validado com sucesso.");
        }

    }

}
