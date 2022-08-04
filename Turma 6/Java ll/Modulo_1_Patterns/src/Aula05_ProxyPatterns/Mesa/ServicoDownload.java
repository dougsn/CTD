package Aula05_ProxyPatterns.Mesa;

public class ServicoDownload implements Download{


    @Override
    public void downloadMusica( String identificador, String tipo) {
        System.out.println("O usuário " + identificador + " pode baixar a música, pois ele é: " + tipo);
    }
}
