package com.example.Medicamentos.dao.imp;

import com.example.Medicamentos.dao.ConfiguracaoJDBC;
import com.example.Medicamentos.dao.IDao;
import com.example.Medicamentos.model.MedicamentoModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicamentoDaoImp implements IDao<MedicamentoModel> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public MedicamentoDaoImp(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public MedicamentoModel salvar(MedicamentoModel medicamento) {
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
    public MedicamentoModel buscarPorId(Integer id) {
        Connection connection = configuracaoJDBC.getConnection();
        Statement statement = null;

        String query = String.format("SELECT ID,NOME,LABORATORIO,QUANTIDADE,PRECO FROM MEDICAMENTOS WHERE ID = " + id);

        MedicamentoModel medicamento = null;

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                medicamento = new MedicamentoModel(rs.getInt("id"),rs.getString("nome"), rs.getString("laboratorio"),rs.getInt("quantidade"),rs.getDouble("preco"));
            }

            statement.close();

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return medicamento;
    }

}
