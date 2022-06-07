import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{

    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, Integer porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        return "Imprimindo da Epson";
    }

    public String imprimeEpson(){
        return "Epson";
    }

}
