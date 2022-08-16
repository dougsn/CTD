package IntegradoraV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String url;
    private String nomeUsuario;
    private String senha;


    public ConfiguracaoJDBC(String jdbcDriver, String url, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.url = url;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC(){
        this.jdbcDriver = "org.h2.Driver";
        this.url = "jdbc:h2:mem:paciente;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'createPaciente.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection getConnection (){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url,nomeUsuario,senha);
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return connection;

    }

}
