package Aula08_FacadePattern.ExercicioAula.model;

public class Cartao {

    private String numero;
    private String banco;


    public Cartao(String numero, String banco) {
        this.numero = numero;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "numero='" + numero + '\'' +
                ", banco='" + banco + '\'' +
                '}';
    }
}
