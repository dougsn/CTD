package Aula14_PadraoDAO.Aula;

import Aula11_AcessoBDD.ExemploPG.ConexaoDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfiguracaoJDBC configuracaoJDBC; // Criando a varial que faz a conexão com o banco

    final static Logger log = Logger.getLogger(String.valueOf(MedicamentoDaoH2.class)); // Criando a varial para criar os logs


    public MedicamentoDaoH2(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {

       log.info("Registrando um novo medicamento: " + medicamento);
       Connection connection = configuracaoJDBC.getConnection();
       Statement statement = null;

       String query = String.format("INSERT INTO MEDICAMENTOS(NOME,LABORATORIO,QUANTIDADE,PRECO)" +
               "VALUES('%s','%s','%s','%s')",medicamento.getNome(),medicamento.getLaboratorio(), medicamento.getQuantidade(), medicamento.getPreco());

       try {

           statement = connection.createStatement();
           statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS); // Pega automaticamente a chave primaria; Por conta do AUTO_INCREMENT
           ResultSet keys = statement.getGeneratedKeys(); // Pegando as chaves criadas.

           if(keys.next()){ // Verificando se as chaves está tendo os próximos itens
               medicamento.setId(keys.getInt(1)); // Setando a chave.
               statement.close();
               connection.close();
           }
       } catch (SQLException e){
           e.printStackTrace();
       }


       return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {

        log.info("Buscando medicamento com o ID: " + id);
        Connection connection = configuracaoJDBC.getConnection();
        Statement statement = null;

        String query = String.format("SELECT ID,NOME,LABORATORIO,QUATIDADE,PRECO FROM MEDICAMENTOS WHERE ID = '%s'" + id);

        Medicamento medicamento = null;

        try {
          statement = connection.createStatement();
          ResultSet rs = statement.executeQuery(query);

          while (rs.next()){
              medicamento = new Medicamento(rs.getInt("id"),rs.getString("nome"), rs.getString("laboratorio"),rs.getInt("quantidade"),rs.getDouble("preco"));
          }

            statement.close();

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return medicamento;
    }


}
