package Aula12_IntegradoraIV.Aula;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    // Instrução para pegar a tabela Usuario, caso já exista, criar um nova tabela.

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            +"("
            +"ID INT PRIMARY KEY,"
            +"PRIMEIRO_NOME VARCHAR(100) NOT NULL,"
            +"SOBRENOME VARCHAR(100) NOT NULL,"
            +"IDADE INT NOT NULL"
            +")";

    // Instruções para inserir dados na tabela USUARIO

    private static final String sqlInsert1 = "INSERT INTO USUARIO (ID,PRIMEIRO_NOME,SOBRENOME,IDADE) " +
            "VALUES (1,'Maria','Almeida',50)";
    private static final String sqlInsert2 = "INSERT INTO USUARIO (ID,PRIMEIRO_NOME,SOBRENOME,IDADE) " +
            "VALUES (2,'José','Silva',40)";
    private static final String sqlInsert3 = "INSERT INTO USUARIO (ID,PRIMEIRO_NOME,SOBRENOME,IDADE) " +
            "VALUES (3,'Juliana','Barbosa',50)";


    // Instrução para excluir um registro a Tabela USUARIO

    private static final String sqlDelete = "DELETE FROM USUARIO WHERE ID = 2";

    private static final Logger logger = Logger.getLogger(Main.class);



    public static void main(String[] args) throws Exception{

        Connection connection = null;


        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
            Statement statement = connection.createStatement();

            // Executa a instrução da criação da tabela no banco de dados.

            statement.execute(sqlCreateTable);

            // Executando a inserção de dados na tabela USUARIO
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

            // Executando a deleção de um registro da tabela USUARIO
            statement.execute(sqlDelete);

            // Registra o log do USUARIO que foi excluído da tabela.

            logger.info("Excluído o usuário com o ID 2");

        } catch (Exception e ){
            e.printStackTrace();
        } finally {
            if(connection == null){ // Se a conexão for nula, retorne nada
                return;
            } // Mas se ela não for nula, feche a conexão
            connection.close();
        }

    }


}
