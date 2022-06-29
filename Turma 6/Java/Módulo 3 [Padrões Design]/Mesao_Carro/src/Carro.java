public class Carro {

    private boolean freioAcionado = false;
    // o this é usado apenas para o método inicial
    private Estado estado = new Desligado(this); // Já vai instanciar com o carro desligado e com o freio false;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFreioAcionado(boolean freioAcionado) {
        this.freioAcionado = freioAcionado;
    }

    public Estado getEstado() {
        return estado;
    }

    public boolean getFreioAcionado() {
        return freioAcionado;
    }
}
