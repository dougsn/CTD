public class Vendedor extends Funcionario{

    private double comicao;
    public Vendedor(String nome, String sobrenome, String cpf, String email, String matricula, double salario, double comicao) {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.comicao = comicao;
    }

    @Override
    public void pagamento() {
        System.out.println("O vendedor vai receber: " + (getSalario() + comicao));
    }
}
