package Aula06_Integradora;

public class Serie implements ISeries{

    private String nome;

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSerie(String nome) {
        return "www." + nome;
    }

    @Override
    public String toString() {
        return "Serie: " +
                getSerie(nome);
    }
}
