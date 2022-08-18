package Aula13_ConsultasBDD.Aula;

import java.sql.*;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF  EXISTS CONTA; CREATE TABLE CONTA" +
            "(" +
            "ID INT PRIMARY KEY," +
            "NOME VARCHAR(100) NOT NULL," +
            "NUMEROCONTA VARCHAR(100) NOT NULL," +
            "SALDO NUMERIC (15,2) NOT NULL" +
            ");";

    private static final String sqlInsert = "INSERT INTO CONTA(ID, NOME, NUMEROCONTA, SALDO) " +
            "VALUES(?, ?, ?, ?);";

    private static final String sqlUpdate = "UPDATE CONTA SET SALDO = ? WHERE ID = ?";

    private static final String sqlInfo = "SELECT * FROM CONTA;";

    public static void main(String[] args) throws Exception{

        Conta conta = new Conta(1,"Daniel","23dsfer36",30d);

        Connection connection = null;

        try {

            connection = ConnectionJDBC.getConnection(); // Utilizando a classe que criamos com a configuração da conexão com o BDD.
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setInt(1,conta.getId());
            preparedStatement.setString(2,conta.getNome());
            preparedStatement.setString(3,conta.getNumConta());
            preparedStatement.setDouble(4,conta.getSaldo());
            preparedStatement.execute();

            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setDouble(1,conta.aumentarSaldo(10d));
            psUpdate.setInt(2,conta.getId());
            psUpdate.execute();

            PreparedStatement psUpdate2 = connection.prepareStatement(sqlUpdate);
            psUpdate2.setDouble(1,conta.aumentarSaldo(15d));
            psUpdate2.setInt(2,conta.getId());
            psUpdate2.execute();

            connection.commit();
            connection.setAutoCommit(true);



        }catch (SQLException e){
            e.printStackTrace();
            connection.rollback();
        } finally {
            Statement statement2 = connection.createStatement();
            ResultSet resultSet = statement2.executeQuery(sqlInfo);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDouble(4));
            }
            connection.close();
        }


    }

}
