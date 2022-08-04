package Aula06_Integradora.Aula;

public class FilmeNaoHabilitadoException extends RuntimeException {

    public String messageError(String nome) {

        return "Filme " + nome + " não disponível no seu país";
    }
}


