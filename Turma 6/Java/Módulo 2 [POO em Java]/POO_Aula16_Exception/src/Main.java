public class Main {
    public static void main(String[] args)  {
        Cliente cliente = new Cliente("Teste", "Sobrenome", "RG", 100);

        try {
            cliente.pagarDivida(10);
        } catch (ClienteException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim");
        }


    }
}
