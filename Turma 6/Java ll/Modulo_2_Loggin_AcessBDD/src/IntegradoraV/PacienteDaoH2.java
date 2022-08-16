package IntegradoraV;

import Aula14_PadraoDAO.Aula.MedicamentoDaoH2;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class PacienteDaoH2 implements IDao<Paciente>{

    private ConfiguracaoJDBC  configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(MedicamentoDaoH2.class));

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Paciente cadastrar(Paciente paciente) {

        log.info("Registrando um novo paciente: " + paciente);
        Connection connection = configuracaoJDBC.getConnection();
        Statement statement = null;

        String query = String.format("INSERT INTO PACIENTE (NOME,SOBRENOME,RG,DATACADASTRO) " +
                "VALUES ('%s','%s','%s','%s')",paciente.getNome(), paciente.getSobrenome(),paciente.getRg(),paciente.getDataCadastro());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                paciente.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return paciente;
    }

    @Override
    public Paciente buscar(int id) {

        log.info("Buscando o paciente com o ID: " + id);
        Connection connection = configuracaoJDBC.getConnection();
        Statement statement = null;

        String query = String.format("SELECT ID,NOME,SOBRENOME,RG,DATACADASTRO FROM PACIENTE WHERE ID = " + id);

        Paciente paciente = null;
        Endereco endereco = null;

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                endereco = new Endereco("asds",123,"cidade","bairro");
                paciente = new Paciente(rs.getInt("id"),rs.getString("nome"),rs.getString("sobrenome")
                        ,rs.getString("rg"),rs.getString("data"));
            }

            statement.close();

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return paciente;
    }

    @Override
    public Paciente deletar(int id) {
        return null;
    }

    @Override
    public Paciente modificar(int id) {
        return null;
    }
}
