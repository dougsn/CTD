public class Caminhao {

    private String marca;
    private String patente;

    private static double valorCombustivel;
    // Criando uma variavel de classe, ela armazena valores comuns a todo os objetos. Como o combustivel.


    public  Caminhao(String marca, String patente){

        this.marca = marca;
        this.patente = patente;

    }


    // Para utilizar as variaveis de classe, temos que instanciar a classe e posteriormente a variavel.

    public double gastoCombustivel(int litros){

         return litros * Caminhao.valorCombustivel;

    }
    // Método de classe, no caso está sendo utilizado para servir de método para mudar o preço do combustível.
    static public void mudarPrecoCombustivel(double preco){

        Caminhao.valorCombustivel = preco;

    }




}
