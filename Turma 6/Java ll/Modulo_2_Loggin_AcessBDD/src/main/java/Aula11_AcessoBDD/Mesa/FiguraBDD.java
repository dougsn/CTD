package Aula11_AcessoBDD.Mesa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//        Criar uma tabela no banco de dados;
//        Inserir 2 círculos e 3 quadrados de diferentes cores;
//        Criar uma consulta (query) para visualizar os círculos de cor vermelha;
//        Exibir as figuras na tela utilizando um ResultSet e um System.out.println.


public class FiguraBDD {
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        Statement statement = connection.createStatement();     // O statement envia as querys para serem executadas no banco de dados.

        String sqlCreateTableFigure = "DROP TABLE IF EXISTS Figura;" +
                "CREATE TABLE Figura(ID INT PRIMARY KEY AUTO_INCREMENT, TIPO VARCHAR(255), COR VARCHAR(255))";

        statement.execute(sqlCreateTableFigure);

        String figura1 = "INSERT INTO Figura (TIPO, COR) VALUES('Circulo','Vermelho')";
        String figura2 = "INSERT INTO Figura (TIPO, COR) VALUES('Circulo','Azul')";
        String figura3 = "INSERT INTO Figura (TIPO, COR) VALUES('Quadrado','Vermelho')";
        String figura4 = "INSERT INTO Figura (TIPO, COR) VALUES('Quadrado','Azul')";
        String figura5 = "INSERT INTO Figura (TIPO, COR) VALUES('Quadrado','Verde')";

        statement.execute(figura1);
        statement.execute(figura2);
        statement.execute(figura3);
        statement.execute(figura4);
        statement.execute(figura5);


        String sqlRead = "SELECT * FROM Figura WHERE TIPO = 'Circulo' AND COR = 'Vermelho'";

        ResultSet resultSet = statement.executeQuery(sqlRead);

        while (resultSet.next()){

            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));


        }


    }
}
