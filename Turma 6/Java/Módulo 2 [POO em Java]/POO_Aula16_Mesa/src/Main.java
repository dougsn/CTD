import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws InternacaoException, DataException {

        Paciente paciente=new Paciente(
                "Juan",
                "Perez",
                "12345",
                LocalDate.of(2022, 11, 10));




        try {
        paciente.darAlta(LocalDate.of(2023, 5, 11));
        } catch(DataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim");
        }




    }
}
