import java.time.LocalDate;
import java.util.Date;


public class ImpressoraAula {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao; // Pegando a data local, sem o horário
    private int folhasDisponiveis; // Forçando a ter um valor, o Integer aceita nulos, por isso não foi utilizado


    public ImpressoraAula(String modelo, String tipoConexao, LocalDate dataFabricacao){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }
    // Sobrecarga de construtor
    public ImpressoraAula(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel(){
        return getFolhasDisponiveis() > 0;
    }

    public void imprimir(String texto){
        if(temPapel()){
            System.out.println(texto);
            this.folhasDisponiveis--;
        } else {
            System.out.println("Não tem papel suficiente para a impressão!");
        }
    }
}
