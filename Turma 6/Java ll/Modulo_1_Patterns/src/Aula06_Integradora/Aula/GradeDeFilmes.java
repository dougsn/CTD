package Aula06_Integradora.Aula;

public class GradeDeFilmes implements IGradeDeFilmes{
    @Override
    public void getFilme(String nome, String pais, String link) {
        System.out.println("O filme: " + nome + " do país " + pais + " e o seu link é: " + link);
    }
}
