package Aula20_IntegradoraVI.Desafio1;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String doc_identificacao;
    private double salario;

    public Funcionario(){

    }

    public Funcionario(String nome, String sobrenome, String doc_identificacao, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.doc_identificacao = doc_identificacao;
        this.salario = salario;
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

    public String getDoc_identificacao() {
        return doc_identificacao;
    }

    public void setDoc_identificacao(String doc_identificacao) {
        this.doc_identificacao = doc_identificacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", doc_identificacao='" + doc_identificacao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
