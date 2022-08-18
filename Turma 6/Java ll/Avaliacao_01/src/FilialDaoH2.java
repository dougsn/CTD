import java.sql.*;
import java.util.logging.Logger;

public class FilialDaoH2 implements IDao<Filial>{

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(FilialDaoH2.class));



    public FilialDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Filial salvar(Filial filial) throws SQLException {
        log.info("Cadastrando uma nova Filial: " + filial);

        Connection connection = null;
        Statement statement = null;

        String sqlInsert = String.format("INSERT INTO FILIAL (NOME_FILIAL, RUA, NUMERO, CIDADE, ESTADO, CINCO_ESTRELA) " +
                "VALUES ('%s','%s','%s','%s','%s','%s')",
                filial.getNomeFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.iseCincoEstrelas());

        try {
            connection = configuracaoJDBC.getConnection();

            statement = connection.createStatement();
            statement.executeUpdate(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                filial.setId(keys.getInt(1));
                statement.close();
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
            connection.rollback();
        }

        return filial;
    }

//    @Override
//    public Filial buscar(int id) {
//        return null;
//    }
//
//    @Override
//    public Filial modificar(int id) {
//        return null;
//    }
//
//    @Override
//    public Filial deletar(int id) {
//        return null;
//    }
}
