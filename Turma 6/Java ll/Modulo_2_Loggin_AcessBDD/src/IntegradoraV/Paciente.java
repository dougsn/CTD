package IntegradoraV;

import java.text.DateFormat;
import java.util.Date;

public class Paciente {

    private int id;
    private String nome;
    private String sobrenome;
    private String rg;
    private String dataCadastro;

//    private Endereco endereco;

    public Paciente(int id, String nome, String sobrenome, String rg, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
    }

    public Paciente(String nome, String sobrenome, String rg, String dataCadastro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }



    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg='" + rg + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
