public class Contratado extends Funcionario{
    private double valorHora;
    private int qtdHoras;


    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int qtdHoras) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double calcularSaldo() {
        return valorHora * qtdHoras;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("\nGerado um recibo -- Fucionário CONTRATADO");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("\nFoi depositada uma quantia de: " + quantia);
    }
}
