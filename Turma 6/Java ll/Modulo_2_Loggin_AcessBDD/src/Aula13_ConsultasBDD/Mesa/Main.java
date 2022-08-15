package Aula13_ConsultasBDD.Mesa;

import java.sql.*;

public class Main {


    private static final String sqlCreateTable = "DROP TABLE IF EXISTS DENTISTA; CREATE TABLE DENTISTA " +
            "(" +
            " ID INT PRIMARY KEY AUTO_INCREMENT," +
            "NOME VARCHAR(100) NOT NULL," +
            "SOBRENOME VARCHAR(100) NOT NULL," +
            "MATRICULA INT NOT NULL" +
            ")";
    private static final String sqlInsert = "INSERT INTO DENTISTA (NOME,SOBRENOME,MATRICULA) VALUES(?,?,?)";
    private static final String sqlUpdate = "UPDATE DENTISTA SET MATRICULA = ? WHERE NOME = ?";


    public static void main(String[] args) throws Exception {

        Dentista dentista = new Dentista("Douglas","Silva", 815);

        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable); // Executando a query

            // Preparando as querys

            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);

            psInsert.setString(1,dentista.getNome());
            psInsert.setString(2,dentista.getSobrenome());
            psInsert.setInt(3,dentista.getMatricula());

            psInsert.execute(); // Executando a query

            connection.setAutoCommit(false); // Desativando para realizar o UPDATE

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setInt(1,dentista.setMatricula(900));
            psUpdate.setString(2, "Douglas");
            psUpdate.execute();


            connection.commit(); // Commitando as informações que foram preparadas.

            connection.setAutoCommit(true); // Voltando o autocommit para true

            String sqlConsulta = "SELECT NOME,SOBRENOME,MATRICULA FROM DENTISTA";
            Statement statement2 = connection.createStatement();
            ResultSet rs =  statement2.executeQuery(sqlConsulta);

            while (rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }


    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }



}
