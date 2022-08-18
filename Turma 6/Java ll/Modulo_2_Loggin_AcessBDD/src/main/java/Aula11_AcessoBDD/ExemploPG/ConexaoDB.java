package Aula11_AcessoBDD.ExemploPG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {

    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa",""); //Configurando a conexão com o BDD
        Statement statement = connection.createStatement();     // O statement envia as querys para serem executadas no banco de dados.

        //Criando um tabela no banco de dados
        String sqlCreateTable = "DROP TABLE IF EXISTS Teste; CREATE TABLE Teste(ID INT PRIMARY KEY AUTO_INCREMENT, NOME VARCHAR(255))";

        // Executando a query acima
        statement.execute(sqlCreateTable);

        // Criando as inserções no banco de dados
        String sqlInsert1 = "INSERT INTO Teste(NOME) VALUES('Olá Mundo')";
        String sqlInsert2 = "INSERT INTO Teste(NOME) VALUES('Tchau Mundo')";
        String sqlInsert3 = "INSERT INTO Teste(NOME) VALUES('Ola Novamente Mundo')";
        String sqlInsert4 = "INSERT INTO Teste(NOME) VALUES('Tchau Novamente Mundo')";

        // Executando as querys de inserção no banco de dados
        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);
        statement.execute(sqlInsert3);
        statement.execute(sqlInsert4);

        // Preparando para ler as informações que foram gravados no banco de dados.
        String sqlRead = "SELECT * FROM Teste";

        // Retornando a consulta de leitura dos campos.
        ResultSet resultSet = statement.executeQuery(sqlRead); // Retorna como um array, retornando as informações de linha a linha do bdd.

        while(resultSet.next()){ // Enquanto tiver uma próxima linha no retorno, ele vai executar
            // Aqui pegamos a primeira coluna e concatenamos com a informação da segunda coluna do banco de dados
            // Quando buscarmos a coluna, temos que colocar o TIPO do retorno que a coluna tem.
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
        }





    }


}
