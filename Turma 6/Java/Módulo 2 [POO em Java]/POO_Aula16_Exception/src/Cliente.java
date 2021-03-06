

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double dividaEmConta;
    private double limite;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        dividaEmConta=0;

    }
    public void comprar(double valor) throws LimiteException {
        if(valor > limite) {
            throw new LimiteException();
        }
        dividaEmConta+=valor;
    }



    public void pagarDivida(double valor) throws DividaExpection {
        if(dividaEmConta <= 0){
            throw new DividaExpection();
        }
        dividaEmConta-=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", sua dívida é=" + dividaEmConta + "R$ }";
    }
}