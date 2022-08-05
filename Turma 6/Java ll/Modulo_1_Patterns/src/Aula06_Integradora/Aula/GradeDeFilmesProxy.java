package Aula06_Integradora.Aula;

public class GradeDeFilmesProxy implements IGradeDeFilmes{

    private final int ip;

    public GradeDeFilmesProxy(int ip) {
        this.ip = ip;
    }

    @Override
    public void getFilme(String nome, String pais, String link) {
        if(ip < 50){
            GradeDeFilmes gradeDeFilmes = new GradeDeFilmes();
            gradeDeFilmes.getFilme(nome,"Argentina",link);
        } else if(ip <= 99){
            GradeDeFilmes gradeDeFilmes = new GradeDeFilmes();
            gradeDeFilmes.getFilme(nome,"Brasil",link);
        } else if(ip <= 149){
            GradeDeFilmes gradeDeFilmes = new GradeDeFilmes();
            gradeDeFilmes.getFilme(nome,"Colombia",link);
        } else {
            throw new FilmeNaoHabilitadoException();
        }

    }


}
