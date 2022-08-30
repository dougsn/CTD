package com.example.Ecommerc.dao.imp;

import com.example.Ecommerc.dao.ConfiguracaoJDBC;
import com.example.Ecommerc.dao.IDao;
import com.example.Ecommerc.model.Produto;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;



@Configuration
public class ProdutoDAOH2 implements IDao<Produto> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = getLogger(String.valueOf(ProdutoDAOH2.class));



    @Override
    public Produto salvar(Produto produto) throws SQLException {

        log.info("Abrindo conexão");

        String sqlInsert = String.format("INSERT INTO PRODUTO(NOME,VALOR)" +
                "VALUES ('%s','%s')", produto.getNome(), produto.getValor());

        Connection connection = null;

        try {
            log.info("Salvando produto: " + produto.getNome());

            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                produto.setId(resultSet.getInt(1));
            }
        } catch (Exception e){
            e.printStackTrace();
            log.info("Erro ao inserir o produto: " + produto.getNome());
        } finally {
            log.info("Fechando a conexão");
            connection.close();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        log.info("Abrindo uma conexão no Banco de Dados");

        Connection connection = null;
        Statement statement = null;
        String query = "SELECT * FROM PRODUTO";
        List<Produto> produtos = new ArrayList<>();

        try{
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configuracaoJDBC.getConnection();
            statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(query);
            log.info("Buscando todos os produtos do banco");

            while(resultado.next()){
                produtos.add(criarObjetoProduto(resultado));
            }


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            log.info("Encerrando conexão com o Banco de Dados");
            connection.close();
            statement.close();
        }

        return produtos;
    }

    @Override
    public void alterar(Produto produto) throws SQLException {

        String SQLUpdate = String.format("UPDATE PRODUTO SET VALOR = '%s' WHERE ID = '%s'", produto.getValor(), produto.getId());
        Connection connection = null;

        try {
            log.info("Alterando o valor do produto: " + produto.getId() + " - " + produto.getNome());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLUpdate);

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            log.info("Encerrando conexão");
            connection.close();
        }



    }

    @Override
    public Optional<Produto> buscarPorId(int id) throws SQLException {

        log.info("Abrindo uma conexão com o Banco de Dados");
        Connection connection = null;
        Statement statement = null;
        String query = String.format("SELECT * FROM PRODUTO WHERE ID = %s", id);

        Produto produto = null;

        try {
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configuracaoJDBC.getConnection();
            log.info("Buscando produto por id: " + id);
            statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(query);

            while (resultado.next()){
                produto = criarObjetoProduto(resultado);
            }

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            log.info("Fechando a conexão com o Banco de Dados");
            connection.close();
            statement.close();
        }



        return produto != null ? Optional.of(produto) : Optional.empty();
    }

    @Override
    public void excluir(int id) throws SQLException {
        log.info("Abrindo uma conexão com o Banco de Dados");
        Connection connection = null;
        Statement statement = null;
        String SQLDelete = String.format("DELETE FROM PRODUTO WHERE ID = %s", id);

        try {
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configuracaoJDBC.getConnection();
            log.info("Deletando produto por id: " + id);
            statement = connection.createStatement();
            statement.execute(SQLDelete);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            log.info("Encerrando conexão");
            connection.close();
            statement.close();
        }

    }

    private Produto criarObjetoProduto(ResultSet resultSet) throws SQLException{

        int id = resultSet.getInt("ID");
        String nomeProduto = resultSet.getString("NOME");
        double valor = resultSet.getDouble("VALOR");

        return new Produto(id,nomeProduto,valor);
    }


}
