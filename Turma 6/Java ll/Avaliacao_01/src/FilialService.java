import java.sql.SQLException;

public class FilialService {

    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial) throws SQLException {
         filialIDao.salvar(filial);
        return filial;
    }

}
