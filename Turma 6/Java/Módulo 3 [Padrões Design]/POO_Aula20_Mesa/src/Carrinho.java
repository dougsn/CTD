public class Carrinho {

    private Estado estado;

    public Carrinho() {
      setEstado(new Vazio(this));
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
