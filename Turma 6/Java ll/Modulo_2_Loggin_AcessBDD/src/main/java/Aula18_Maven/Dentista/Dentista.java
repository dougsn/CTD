package Aula18_Maven.Dentista;

public class Dentista {

    private Long id;
    private String nome;
    private String sobrenome;
    private int matricula;


    public Dentista(String nome, String sobrenome, int matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
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

    public int getMatricula() {
        return matricula;
    }

    public int setMatricula(int matricula) {
        this.matricula = matricula;
        return matricula;
    }
}
