package Aula07_FlyweightPattern.Mesa;

public class Main {

    public static void main(String[] args) {


        ArvoreFactory arvore = new ArvoreFactory();

        int i = 1;

        Arvore a3 = arvore.getArvore(100,200,"azul");

        while (i <= 500000){
            Arvore a1 = arvore.getArvore(200,400,"verde");
            Arvore a2 = arvore.getArvore(500,300,"vermelho");
            i++;
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }

}
