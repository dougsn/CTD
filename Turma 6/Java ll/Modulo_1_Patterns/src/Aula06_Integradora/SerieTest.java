package Aula06_Integradora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerieTest {

    Serie serie1 = new Serie("Serie1");
    Serie serie2 = new Serie("Serie2");
    Serie serie3 = new Serie("Serie3");
    Serie serie4 = new Serie("Serie4");
    Serie serie5 = new Serie("Serie5");

    ISeries iSeries = new SerieProxy();

    @Test

    public void mainTest(){
        iSeries.getSerie(serie1.getNome());
        iSeries.getSerie(serie2.getNome());
        iSeries.getSerie(serie3.getNome());
        iSeries.getSerie(serie4.getNome());
        iSeries.getSerie(serie5.getNome());

    }

}