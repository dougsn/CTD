public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String som() {
        return  "Som de Cavalo";
    }

    public String correr(){
        return "Correndo igual Cavalo";
    }
}
