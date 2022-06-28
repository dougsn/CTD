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
        if (dataInternacao.isBefore(hoje))
            this.dataInternacao=dataInternacao;
        else {
            throw new InternacaoException();
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
