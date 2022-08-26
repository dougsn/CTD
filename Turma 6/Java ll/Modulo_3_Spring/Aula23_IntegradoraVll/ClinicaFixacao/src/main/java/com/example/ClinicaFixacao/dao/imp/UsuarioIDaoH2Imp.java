package com.example.ClinicaFixacao.dao.imp;

import com.example.ClinicaFixacao.dao.ConfiguracaoJDBC;
import com.example.ClinicaFixacao.dao.IDao;
import com.example.ClinicaFixacao.model.UsuarioModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioIDaoH2Imp implements IDao<UsuarioModel> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public UsuarioIDaoH2Imp(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public UsuarioModel salvar(UsuarioModel usuarioModel) {
        Connection connection = configuracaoJDBC.getConnection();
        Statement statement = null;

        String query = String.format("INSERT INTO USUARIO(NOME,EMAIL,SENHA,NIVEL_ACESSO)" +
                "VALUES('%s','%s','%s','%s')",usuarioModel.getNome(),usuarioModel.getEmail(), usuarioModel.getSenha(), usuarioModel.getNivel_acesso());

        try {

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); // Pega automaticamente a chave primaria; Por conta do AUTO_INCREMENT
            ResultSet keys = statement.getGeneratedKeys(); // Pegando as chaves criadas.

            if(keys.next()){ // Verificando se as chaves está tendo os próximos itens
                usuarioModel.setId(keys.getInt(1)); // Setando a chave.
                statement.close();
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return usuarioModel;
    }

    @Override
    public UsuarioModel buscar(Integer id) {
        Connection connection = configuracaoJDBC.getConnection();
        Statement statement = null;

        String query = String.format("SELECT * FROM USUARIO WHERE ID = " + id);

        UsuarioModel usuarioModel = null;

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                usuarioModel = new UsuarioModel(rs.getInt("id"),rs.getString("nome"), rs.getString("email"),rs.getString("senha"),rs.getString("nivel_acesso"));
            }

            statement.close();

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return usuarioModel;
    }
}
