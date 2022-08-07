package Aula08_FacadePattern.ExemploPG.model;

public class Cartao {
    private String numerosFrente;
    private String codSeguranca;
    private String dataVencimento;

    public Cartao(String numerosFrente, String codSeguranca, String dataVencimento) {
        this.numerosFrente = numerosFrente;
        this.codSeguranca = codSeguranca;
        this.dataVencimento = dataVencimento;
    }

    public String getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(String numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "numerosFrente='" + numerosFrente + '\'' +
                ", codSeguranca='" + codSeguranca + '\'' +
                ", dataVencimento='" + dataVencimento + '\'' +
                '}';
    }
}
