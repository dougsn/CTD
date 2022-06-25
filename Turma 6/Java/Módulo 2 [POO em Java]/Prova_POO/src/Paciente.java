public abstract class Paciente{

    private String dataNascimento;
    private String nome;
    private String sobrenome;
    private boolean primeiraConsulta;

    public Paciente(String dataNascimento, String nome, String sobrenome, boolean primeiraConsulta) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.primeiraConsulta = primeiraConsulta;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public boolean isPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public abstract String avaliacaoInicial();

}

