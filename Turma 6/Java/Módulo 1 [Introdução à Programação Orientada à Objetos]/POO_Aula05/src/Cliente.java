public class Cliente {

    private Integer numeroCliente;
    private String nome;
    private Double divida = 0.0;

    public Cliente(Integer numeroCliente, String nome){
        this.numeroCliente = numeroCliente;
        this.nome = nome;
    }

    // encapsulando com os GETTERS E SETTERS;

    public void setNumeroCliente(Integer numero) {
        this.numeroCliente =  numero;
    }

    public Integer getNumeroCliente(){
        return this.numeroCliente;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    protected void setDivida(Double valor){
        this.divida = valor;
    }
    // O protected  significa  que esse metodo é protegido e pode ser utilizado por quem está dentro do pacote (Artigo, Caminhao, Main e etc), que estiver fora, não vai conseguir ter acesso.


    public Double getDivida(){
        return this.divida;
    }

    public void aumetarDivida(Double valor){
        setDivida(this.divida += valor);
    }

    public void pagarDivida(Double valor){
        if (this.divida <= 0){
            System.out.println("Sua divida já está paga!");
        }else if(this.divida < valor){
            System.out.println("Valor superior a  divida,  sua divida é de: " + this.divida);
        }else{
            setDivida(this.divida -= valor);
        }


    }



}
