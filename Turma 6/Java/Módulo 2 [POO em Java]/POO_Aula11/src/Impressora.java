import java.time.LocalDate;

abstract class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private Integer folhasDisponiveis;
    private int porcentagemTinta;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, int porcentagemTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcentagemTinta = porcentagemTinta;
    }

    public boolean temPapel(){
        return folhasDisponiveis > 0;
    }

    public boolean precisaTinta(){
        return porcentagemTinta > 0.1;
    }

    public abstract String imprimir();


}
