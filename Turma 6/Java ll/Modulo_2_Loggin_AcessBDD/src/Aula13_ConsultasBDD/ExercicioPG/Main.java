package Aula13_ConsultasBDD.ExercicioPG;

import java.sql.*;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO " +
            "(" +
            " ID INT PRIMARY KEY," +
            "NOME VARCHAR(100) NOT NULL," +
            "EMAIL VARCHAR(100) NOT NULL," +
            "SALDO NUMERIC(15,2) NOT NULL" +
            ")";
    private static final String sqlInsert = "INSERT INTO USUARIO (ID,NOME,EMAIL,SALDO) VALUES(?, ?, ?, ?)";
    private static final String sqlUpdate = "UPDATE USUARIO SET SALDO = ? WHERE EMAIL = ?";

    public static void main(String[] args) throws Exception {


        Usuario usuario = new Usuario("Pedro","pedro@dh.com",10d);

        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            // O PreparedStatement, prepara as querys para depois commitar.
            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);

            psInsert.setInt(1, 1);
            psInsert.setString(2,usuario.getNome());
            psInsert.setString(3,usuario.getEmail());
            psInsert.setDouble(4, usuario.getSaldo());

            psInsert.execute(); // Aqui o usuário é efetivamente saldo na tabela. A query é realizada aqui

            connection.setAutoCommit(false); // Desativando para termos mais controle.


            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setDouble(1,usuario.aumentarSaldo(10d));
            psUpdate.setString(2,usuario.getEmail());
            psUpdate.execute();

            // Erro criado intensionalmente, para verificar se o rollback está funcionando corretamente.
            int a = 4/0;

            connection.commit(); // Comitando tudo o que foi realizado acima.

            connection.setAutoCommit(true); // Ativando novamente o autocommit.


            String sql = "SELECT * FROM USUARIO";
            Statement statement2 = connection.createStatement();
            ResultSet resultSet = statement2.executeQuery(sql);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDouble(4));
            }

        } catch (Exception e){
            e.printStackTrace();
            connection.rollback(); // Se der algo de errado, ele volta o estado anterior do commit do banco de dados.
        } finally {
            connection.close(); // Fecha a conexão com o banco de dados depois de realizar o que deve ser feito
        }



        // Realizando uma consulta após inserir o erro aritmetico com o 4/0. Para validar se está ocorrendo o rollback corretamente.

        Connection connection1 = getConnection();
        String sql = "SELECT * FROM USUARIO";
        Statement statement2 = connection1.createStatement();
        ResultSet resultSet = statement2.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDouble(4));
        }
    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

}
