public class Cachorro extends Animal{

    public Cachorro (String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String som() {
        return "Som de Cachorro";
    }

    public String correr(){
        return "Correndo igual Cachorro";
    }
}
