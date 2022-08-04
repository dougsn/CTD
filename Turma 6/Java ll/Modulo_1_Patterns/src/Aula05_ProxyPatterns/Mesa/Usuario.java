package Aula05_ProxyPatterns.Mesa;

public class Usuario {

    private String identificador;
    private String tipo;

    public Usuario(String identificador, String tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "identificador='" + identificador + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
