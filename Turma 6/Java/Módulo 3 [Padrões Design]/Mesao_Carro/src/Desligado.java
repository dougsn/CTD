public class Desligado implements Estado{

    private Carro carro;

    public Desligado(Carro carro){
        this.carro = carro;
    }

    @Override
    public void startStop() {
        if(carro.getFreioAcionado()){

        }
    }
}
