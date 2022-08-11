package Aula12_IntegradoraIV;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.sql.*;

public class Main {

    private static final org.apache.log4j.Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();

        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        Statement statement = connection.createStatement();

        Funcionario funcionario1 = new Funcionario(1,"Douglas","Nascimento",23,"(21)92136-6547");
        Funcionario funcionario2 = new Funcionario(1,"Rafaella","Cuba",23,"(21)96547-7513");
        Funcionario funcionario3 = new Funcionario(2,"Rodrigo","Silva",34,"(21)95624-9320");

        String sqlCreateTable = "DROP TABLE IF EXISTS FUNCIONARIO; " +
                "CREATE TABLE FUNCIONARIO(ID INT PRIMARY KEY, " +
                "NOME VARCHAR(255), " +
                "SOBRENOME VARCHAR(255)," +
                "IDADE INT," +
                "TELEFONE VARCHAR(255))";

        String sqlInsert1 = "INSERT INTO FUNCIONARIO(ID,NOME,SOBRENOME,IDADE,TELEFONE)" +
                " VALUES(" + funcionario1.getId() + "," + "'" + funcionario1.getNome() +"'" + ", " + "'" +funcionario1.getSobrenome()+ "'" + "," + funcionario1.getIdade() + "," + "'" + funcionario1.getTelefone() + "')";
        String sqlInsert2 = "INSERT INTO FUNCIONARIO(ID,NOME,SOBRENOME,IDADE,TELEFONE)" +
                " VALUES(" + funcionario2.getId() + "," + "'" + funcionario2.getNome() +"'" + ", " + "'" +funcionario2.getSobrenome()+ "'" + "," + funcionario2.getIdade() + "," + "'" + funcionario2.getTelefone() + "')";
        String sqlInsert3 = "INSERT INTO FUNCIONARIO(ID,NOME,SOBRENOME,IDADE,TELEFONE)" +
                " VALUES(" + funcionario3.getId() + "," + "'" + funcionario3.getNome() +"'" + ", " + "'" +funcionario3.getSobrenome()+ "'" + "," + funcionario3.getIdade() + "," + "'" + funcionario3.getTelefone() + "')";

        String attFunc = "UPDATE FUNCIONARIO SET NOME = 'Renato' WHERE ID = " + funcionario3.getId();

        String deleteFunc = "DELETE FROM FUNCIONARIO WHERE ID = " + funcionario2.getId();

        String func3 = "SELECT * FROM FUNCIONARIO WHERE ID = " + funcionario3.getId();

        statement.execute(sqlCreateTable);




        try{
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(attFunc);
            statement.execute(deleteFunc);

            String sqlRead = "SELECT * FROM FUNCIONARIO";

            ResultSet resultSet = statement.executeQuery(sqlRead);


            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3) + " - " + resultSet.getInt(4) + " ' " + resultSet.getString(5));
            }


        } catch (SQLException e){
            if((funcionario1.getId() == funcionario2.getId()) ||
                    (funcionario1.getId() == funcionario3.getId()) ||
                    funcionario2.getId() == funcionario3.getId() ){
                logger.info("ID duplicada cadastrada. " + e);
            }

            ResultSet resultSet2 = statement.executeQuery(func3);
            logger.debug("O funcionário " + funcionario3.getNome() + " foi atualizado com sucesso." );
            logger.info("O funcionário: " + funcionario2 + " foi removido(a) com sucesso.");
        }
//
//
//        try {
//            statement.execute(attFunc);
//        }catch (SQLException e){
//             e.printStackTrace();
//        } finally {
//            logger.debug("O funcionário " + funcionario3.getNome() + " foi atualizado com sucesso. Agora ele é o: " + funcionario3);
//        }


//
//
//        statement.execute(deleteFunc);
//        logger.info("O funcionário: " + funcionario2 + " foi removido(a) com sucesso.");





    }
}
