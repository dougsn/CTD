package Mesa;


public abstract class SistemaArmas {
    private int energia;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void mostrar();

}

