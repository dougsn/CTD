import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Consulta {
    private LocalDate dataConsulta;
    private String especialidade;
    private String horaMinutoConsulta;

    private List<Paciente> pacientes = new LinkedList<>();

    public Consulta(LocalDate dataConsulta, String especialidade, String horaMinutoConsulta) {
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.horaMinutoConsulta = horaMinutoConsulta;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHoraMinutoConsulta() {
        return horaMinutoConsulta;
    }

    public void setHoraMinutoConsulta(String horaMinutoConsulta) {
        this.horaMinutoConsulta = horaMinutoConsulta;
    }

    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "dataConsulta=" + dataConsulta +
                ", especialidade='" + especialidade + '\'' +
                ", horaMinutoConsulta='" + horaMinutoConsulta + '\'' +
                ", paciente=" + pacientes +
                '}';
    }
}

