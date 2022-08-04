package Aula02_TemplateMethodsPatterns;
public class Efetivo extends Funcionario{

    private double salarioBase;
    private double desconto;
    private double bonificacao;


    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double desconto, double bonificacao) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
        this.bonificacao = bonificacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSaldo() {
        return salarioBase + bonificacao - desconto;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("\nGerado um recibo -- Fucionário EFETIVO");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("\nFoi depositada uma quantia de: " + quantia);
    }
}
