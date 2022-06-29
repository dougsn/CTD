public class Vazio implements Estado {

    private Carrinho carrinho;




    @Override
    public void adicionarProduto() {

    }

    @Override
    public void cancelarCarrinho() {
        //
    }

    @Override
    public void retornarAopontoAnterior() {
    //
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstado(new Carregando());
    }
}
