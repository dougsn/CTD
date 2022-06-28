public class EmpregadoRelacaoDep extends Empregado {

    private double salarioMensal;

    public EmpregadoRelacaoDep(String nome) {
        super(nome);
    }

    public EmpregadoRelacaoDep(String nome, String sobreNome, String arquivo) {
        super(nome, sobreNome, arquivo);
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario(int dias) {
        return (salarioMensal / 30) * dias;
    }
}
