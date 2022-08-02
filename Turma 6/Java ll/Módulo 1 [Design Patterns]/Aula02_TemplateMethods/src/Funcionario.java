public abstract class Funcionario {

    private String nome;
    private String sobrenome;
    private String numeroConta;


    public Funcionario(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void pagamentoSalario() {
        double quantia;
        quantia = calcularSaldo();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    public abstract double calcularSaldo();
    public abstract void imprimirRecibo(double quantia);
    public abstract void depositar(double quantia);

}
