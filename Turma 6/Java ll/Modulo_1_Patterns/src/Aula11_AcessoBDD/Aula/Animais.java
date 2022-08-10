package Aula11_AcessoBDD.Aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Animais {

    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        Statement statement = connection.createStatement();


        String sqlTableAnimais = "DROP TABLE IF EXISTS ANIMAL; " +
                "CREATE TABLE ANIMAL(ID INT PRIMARY KEY AUTO_INCREMENT, TIPO VARCHAR(255), NOME VARCHAR(255))";

        statement.execute(sqlTableAnimais);

        String animal1 = "INSERT INTO ANIMAL (TIPO, NOME) VALUES('VIRA-LATA','HULK')";
        String animal2 = "INSERT INTO ANIMAL (TIPO, NOME) VALUES('VIRA-LATA','BIDU')";
        String animal3 = "INSERT INTO ANIMAL (TIPO, NOME) VALUES('PITBULL','LUNA')";
        String animal4 = "INSERT INTO ANIMAL (TIPO, NOME) VALUES('CHOW-CHOW','TANTOFAZ')";
        String animal5 = "INSERT INTO ANIMAL (TIPO, NOME) VALUES('TANTOFAZ','TANTOFAZ')";

        statement.execute(animal1);
        statement.execute(animal2);
        statement.execute(animal3);
        statement.execute(animal4);
        statement.execute(animal5);

        String sqlDelete = "DELETE FROM ANIMAL WHERE TIPO = 'TANTOFAZ'";

        statement.execute(sqlDelete);

        String sqlRead = "SELECT * FROM ANIMAL";

        ResultSet resultSet = statement.executeQuery(sqlRead);

        while (resultSet.next()){

            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));

        }



    }

}
