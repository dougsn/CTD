import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args)  {
        Cliente cliente = new Cliente("Teste", "Sobrenome", "RG", 100);

        try { // Faça o bloco abaixo.
            cliente.pagarDivida(10);
        } catch (DividaExpection e){ // aparece a mensagem de erro, quando a validação do TRY dá errado
            System.out.println(e.getMessage());
//            throw new IllegalStateException("Teste"); // Estourando uma excessão (erro).
        } finally { // Executa independente do erro
            System.out.println("Fim");
        }

        try {
            cliente.pagarDivida(10);
            cliente.comprar(1000);
        } catch (DividaExpection | LimiteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim");
        }


    }
}
