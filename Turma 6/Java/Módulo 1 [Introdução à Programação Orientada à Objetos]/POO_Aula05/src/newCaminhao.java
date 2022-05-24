public class newCaminhao {

    private String marca;
    private String patente;

    static private double valorCombustivel;

    public newCaminhao(String marca, String patente){
        this.marca = marca;
        this.patente = patente;
    }

    public static double precoCombustivel(int litros) {
        return litros * newCaminhao.valorCombustivel;
    }

    static public void mudarPrecoCombustivel( double preco){
        newCaminhao.valorCombustivel = preco;
    }


}
