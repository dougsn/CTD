public class GerenciadorLote extends Gerenciador{

    @Override
    public void verificar(Artigo produto) {
        if (produto.getLote() >= 1000 && produto.getLote() <= 2000) {
            this.getSeguinte().verificar(produto);
        }
        else {
            System.out.println(produto.getNome() + " - REJEITADO - Lote fora dos parâmetros.");
        }
    }
}