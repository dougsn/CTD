public class ProdutoFactory {


    private static ProdutoFactory instance;

    private ProdutoFactory(){};


    public Produto Produto (String tipo){
        switch (tipo) {
            case "CAIXA10X10":
                return new Caixa(5.0, 10.0, 10.0, 10.0);
            case "FUTEBOL":
                return new Bola(5.0, 11.00);
            case "BOLATENIS":
                return new Bola(5.0, 0.32);
            default:
                throw new IllegalStateException("O tipo informado está incorreto.");
        }
    }

    public static ProdutoFactory getInstance(){
        if (instance == null){
            instance = new ProdutoFactory();
        }
        return instance;
    }




}
