public class PacienteParticular extends Paciente{

    private double valorConsulta;
    private String numRg;

    public PacienteParticular(String dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, double valorConsulta, String numRg) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta);
        this.valorConsulta = valorConsulta;
        this.numRg = numRg;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getNumRg() {
        return numRg;
    }

    public void setNumRg(String numRg) {
        this.numRg = numRg;
    }

    @Override
    public String avaliacaoInicial() {
        if(this.isPrimeiraConsulta()){
            return "Como essa é a sua primeira consulta, você deverá passar por uma avaliação inicial, com base no seu histórico clínico.";
        }
        return "Obrigado por nós visitar novamente, seja bem-vindo(a).";
    }

    @Override
    public String toString() {
        return "PacienteParticular{" +
                "dataNascimento='" + this.getDataNascimento() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", sobrenome='" + this.getSobrenome() + '\'' +
                ", primeiraConsulta=" + this.isPrimeiraConsulta() +
                ", valorConsulta=" + valorConsulta +
                ", numRg='" + numRg + '\'' +
                '}';
    }
}

