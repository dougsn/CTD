package Aula14_PadraoDAO.Aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConfiguracaoJDBC {

    // Essa classe é criada para criar de forma dinâmica a tabela, pois ele puxa as informação da tabela por um arquivo externo e deixamos no construtor os atributos preenchidos com as
    // informações para acessar a base de dados.

    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:medicamentos;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'"; // Criando a tabela por um arquivo externo
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection getConnection(){

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl,nomeUsuario,senha);

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;

    }

}
