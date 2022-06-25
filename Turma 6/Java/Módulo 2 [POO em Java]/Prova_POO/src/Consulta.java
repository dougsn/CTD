import java.time.LocalDate;

public class Consulta {
    private LocalDate dataConsulta;
    private String especialidade;
    private String horaMinutoConsulta;


    public Consulta(LocalDate dataConsulta, String especialidade, String horaMinutoConsulta) {
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.horaMinutoConsulta = horaMinutoConsulta;
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


}

