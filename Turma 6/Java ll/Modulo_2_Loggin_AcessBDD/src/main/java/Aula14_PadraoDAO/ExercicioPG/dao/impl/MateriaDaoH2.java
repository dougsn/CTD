package Aula14_PadraoDAO.ExercicioPG.dao.impl;

import Aula14_PadraoDAO.ExercicioPG.dao.ConfiguracaoJDBC;
import Aula14_PadraoDAO.ExercicioPG.dao.IDao;
import Aula14_PadraoDAO.ExercicioPG.model.Materia;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MateriaDaoH2 implements IDao<Materia> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public MateriaDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Materia salvar(Materia materia) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO MATERIAS(NOME) VALUES('%S')", materia.getNome());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()){
                materia.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return materia;

    }

    @Override
    public List<Materia> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM MATERIAS");
        List<Materia> materias = new ArrayList<>();
        try {

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                materias.add(new Materia(rs.getInt("id"), rs.getString("nome")));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return materias;
    }
}
