import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Consulta consulta1 = new Consulta(LocalDate.now(),"Clínico Geral","07:30");
        Consulta consulta2 = new Consulta(LocalDate.now(),"Pediatra","10:30");
        Consulta consulta3 = new Consulta(LocalDate.now(),"Otorrinolaringologista","11:30");

        PacienteParticular paciente1 = new PacienteParticular("09/03/1999","Douglas","Silva",false,80.00, "23.123.345-23");
        PacientePublico paciente2 = new PacientePublico("02/05/2003", "Rafaella", "Cuba", true,98873);
        PacientePublico paciente3 = new PacientePublico("02/05/2003", "Nicollas", "Lopes", false,108873);

        System.out.println("");
        System.out.println("Verificando se há necessidade de avaliação inicial.. \n");

        System.out.println(paciente1.avaliacaoInicial());
        System.out.println(paciente2.avaliacaoInicial());
        System.out.println(paciente3.avaliacaoInicial());


        System.out.println("");
        System.out.println("Comparando pacientes..\n");
        System.out.println(paciente2.compareTo(paciente3));
        System.out.println("");

        // Atribuindo as consultas nos pacientes..

        consulta1.addPaciente(paciente1);
        consulta2.addPaciente(paciente2);
        consulta3.addPaciente(paciente3);

        System.out.println("Verificando os pacientes das consultas..\n");
        System.out.println(consulta1);
        System.out.println(consulta2);
        System.out.println(consulta3);


    }
}
