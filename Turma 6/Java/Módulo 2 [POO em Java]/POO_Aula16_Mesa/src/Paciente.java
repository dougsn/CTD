import java.time.LocalDate;

public class Paciente {
    private String nome;
    private String sobrenome;
    private String historiaClinica;
    private LocalDate dataInternacao;
    private LocalDate dataAlta;


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

//    public void pacienteDeAlta(String nomePaciente {
//
//        for(int i = 0; i < listaPaciente.size(); i++)
//        {
//            Paciente p = listaPaciente.get(i);
//
//            if(p.getNome().equals(nomePaciente)
//            {
//                // Encontrou um paciente com a variável nomePaciente do parâmetro.
//
//                // Remove.
//                listaPaciente.remove(p);
//
//                // Sai do loop.
//                break;
//            }
//        }
//        System.out.print("\nLista após remoç);


}
