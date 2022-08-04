package Aula04_ChainOfResponsibilityPatterns.Mesa;
public class GerenciadorPeso extends Gerenciador{

    @Override
    public void verificar(Artigo produto) {
        if (produto.getPeso() >= 1200 && produto.getPeso() <= 1300) {
            this.getSeguinte().verificar(produto);
        }
        else {
            System.out.println(produto.getNome() + " - REJEITADO - Peso fora dos parâmetros.");
        }
    }
}