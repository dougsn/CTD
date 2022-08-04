package Aula06_Integradora;

public class SerieProxy implements ISeries{
    private int qtdViews = 0;

    public int getQtdViews() {
        return qtdViews;
    }



    @Override
    public String getSerie(String nome) {


        if(nome.equalsIgnoreCase(nome)){
            qtdViews += 1;
            if(getQtdViews() < 6){

                Serie serie = new Serie(nome);
                System.out.println(serie);
            }else  {
                throw new SerieNaoHabilitadaException();
            }
        }

        return null;
    }
}
