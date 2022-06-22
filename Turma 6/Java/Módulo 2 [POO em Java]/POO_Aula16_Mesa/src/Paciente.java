import java.time.LocalDate;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao) throws InternacaoException {   LocalDate hoje=  LocalDate.now();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.isBefore(hoje)){
            throw new IllegalStateException("Data de internação inferior ao dia atual.");
        } else {
            this.dataInternacao=dataInternacao;
        }

    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws DataException {
        if (dataAlta.isAfter(dataInternacao))
            System.out.println("Ok");
        else
            throw new DataException();
    }


}
