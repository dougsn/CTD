package Aula06_Integradora.Aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    Filme f1 = new Filme("Avengers","avengers.com");
    IGradeDeFilmes gradeDeFilmes = new GradeDeFilmesProxy(149);
    IGradeDeFilmes gradeDeFilmes2 = new GradeDeFilmesProxy(49);
    IGradeDeFilmes gradeDeFilmes3 = new GradeDeFilmesProxy(99);

    IGradeDeFilmes gradeDeFilmes4 = new GradeDeFilmesProxy(255);

    @Test

    void mainTest(){



        try {
            gradeDeFilmes2.getFilme(f1.getNome(), f1.getPais(),f1.link);

            gradeDeFilmes3.getFilme(f1.getNome(), f1.getPais(),f1.link);

            gradeDeFilmes.getFilme(f1.getNome(), f1.getPais(),f1.link);

            gradeDeFilmes4.getFilme(f1.getNome(), f1.getPais(),f1.link);
        } catch (FilmeNaoHabilitadoException f){
            System.out.println(f.messageError(f1.getNome()));
        }



    }

}