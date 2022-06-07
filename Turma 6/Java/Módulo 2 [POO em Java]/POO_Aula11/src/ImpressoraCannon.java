import java.time.LocalDate;

public class ImpressoraCannon extends Impressora{

    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, Integer porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        return "Imprimiu da Cannon";
    }

    public String imprimeCannon(){
        return "Cannon";
    }
}
