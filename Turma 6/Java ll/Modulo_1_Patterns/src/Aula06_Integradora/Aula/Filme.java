package Aula06_Integradora.Aula;

public class Filme {

    protected String nome;
    protected String pais;
    protected String link;


    public Filme(){

    }

    public Filme(String nome, String link) {
        this.nome = nome;
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Filme= " +
                "nome:'" + nome + '\'' +
                ", pais:'" + pais + '\'' +
                ", link:'" + link;
    }
}
