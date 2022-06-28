public class PacientePublico extends Paciente implements Comparable<PacientePublico> {

    private Integer numCarteirinha;

    public PacientePublico(String dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, Integer numCarteirinha) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta);
        this.numCarteirinha = numCarteirinha;
    }

    public int getNumCarteirinha() {
        return numCarteirinha;
    }

    public void setNumCarteirinha(Integer numCarteirinha) {
        this.numCarteirinha = numCarteirinha;
    }

    @Override
    public String avaliacaoInicial() {
        if(this.isPrimeiraConsulta()){
            return "Como essa é a sua primeira consulta, você deverá passar por uma avaliação inicial, com base no seu histórico clínico.";
        }
        return "Obrigado por nós visitar novamente, seja bem-vindo(a).";
    }


    @Override
    public int compareTo(PacientePublico o) {
        if(this.numCarteirinha > o.numCarteirinha) return 1;
        if(this.numCarteirinha < o.numCarteirinha) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "PacientePublico {" +
                "dataNascimento='" + this.getDataNascimento() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", sobrenome='" + this.getSobrenome() + '\'' +
                ", primeiraConsulta=" + this.isPrimeiraConsulta() +
                ", numCarteirinha=" + numCarteirinha +
                '}';
    }

}
