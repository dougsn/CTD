package Aula06_Integradora;

public class SerieProxy implements ISeries{
    private int qtdViews = 1;

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }


    @Override
    public String getSerie(String nome) {
        if(nome.equals(nome) && (getQtdViews() < 6)){


            Serie serie = new Serie(nome);
            System.out.println(serie);
            qtdViews += 1;
        } else  {
           throw new SerieNaoHabilitadaException();
        }

        return null;
    }
}
