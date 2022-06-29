public class Carregando implements Estado{

    private Carrinho carrinho;





    @Override
    public void adicionarProduto() {
        System.out.println("Adicionei produto");

    }

    @Override
    public void cancelarCarrinho() {
        carrinho.setEstado(new Vazio());
    }

    @Override
    public void retornarAopontoAnterior() {

    }

    @Override
    public void proximoEstado() {

    }
}
