import java.util.Date;

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private Integer folhasDisponiveis;

    public Impressora (String modelo, String tipoConexao, Date dataFabricacao, Integer folhasDisponiveis){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTipoConexao(){
        return this.tipoConexao;
    }

    public void setTipoConexao(String tipoConexao){
        this.tipoConexao = tipoConexao;
    }

    public Date getDataFabricacao(){
        return this.dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao){
        this.dataFabricacao = dataFabricacao;
    }

    public Integer getFolhasDisponiveis(){
        return this.folhasDisponiveis;
    }

    public void setFolhasDisponiveis(Integer folhasDisponiveis){
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
