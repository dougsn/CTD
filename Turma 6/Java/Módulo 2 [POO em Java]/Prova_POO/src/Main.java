import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Consulta consulta1 = new Consulta(LocalDate.now(),"Clínico Geral","07:30");
        Consulta consulta2 = new Consulta(LocalDate.now(),"Pediatra","10:30");

        PacienteParticular paciente1 = new PacienteParticular("09/03/1999","Douglas","Silva",false,80.00, "23.123.345-23");
        PacientePublico paciente2 = new PacientePublico("02/05/2003", "Dennis", "Carvalho", true,98873);

        System.out.println("Ola");

    }
}
