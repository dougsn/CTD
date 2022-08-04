package Aula06_Integradora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerieTest {

    Serie serie1 = new Serie("asd");
    ISeries iSeries = new SerieProxy();

    @Test

    public void mainTest(){
        iSeries.getSerie(serie1.getNome());
        iSeries.getSerie(serie1.getNome());
        iSeries.getSerie(serie1.getNome());
        iSeries.getSerie(serie1.getNome());
        iSeries.getSerie(serie1.getNome());
        iSeries.getSerie(serie1.getNome());
        iSeries.getSerie(serie1.getNome());
    }

}