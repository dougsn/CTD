package Aula18_Maven.Paciente;


public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente cadastrar(Paciente paciente){
        return pacienteIDao.cadastrar(paciente);
    }

    public Paciente buscar(int id){
        return pacienteIDao.buscar(id);
    }

    public Paciente deletar(int id) {
        return pacienteIDao.deletar(id);
    }

    public Paciente modificar(int id) {
        return pacienteIDao.modificar(id);
    }


}
