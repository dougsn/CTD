public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String som() {
        return "Som de Preguiça";
    }

    public String subirEmArvore(){
        return "Subindo na árvore  como uma Preguiça";
    }

}
