package Aula04_ChainOfResponsibilityPatterns.Mesa;
public class CheckQuality {

    Gerenciador inicial;

    public CheckQuality(){
        this.inicial = new GerenciadorLote();
        Gerenciador peso = new GerenciadorPeso();
        Gerenciador embalagem = new GerenciadorEmbalagem();

        inicial.setSeguinte(peso);
        peso.setSeguinte(embalagem);
    }

    public void verificar(Artigo produto){
        inicial.verificar(produto);
    }
}