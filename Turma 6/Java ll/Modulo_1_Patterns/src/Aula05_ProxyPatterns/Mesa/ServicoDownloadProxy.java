package Aula05_ProxyPatterns.Mesa;

public class ServicoDownloadProxy implements Download{

    @Override
    public void downloadMusica(String identificador, String tipo) {
        if (tipo.equalsIgnoreCase("premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.downloadMusica(identificador,tipo);
            System.out.println("Música baixado com sucesso!");
        } else {
            System.out.println("Você não possui disponível o serviço de download, pois é um usuário(a) " + tipo);
        }
    }
}
