import java.sql.SQLException;

public interface IDao <T>{

    public T salvar(T t) throws SQLException;
//    public T buscar(int id);
//    public T modificar(int id);
//    public T deletar(int id);

}
