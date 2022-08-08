package Aula07_FlyweightPattern.Mesa;

public class Main {

    public static void main(String[] args) {

        Arvore arvore = ArvoreFactory.obterArvore(200.00,400.00,"verde","Ornamentais");
        System.out.println(arvore);
        arvore = ArvoreFactory.obterArvore(500.00,300.00,"vermelho","Frutíferas");
        System.out.println(arvore);
        arvore = ArvoreFactory.obterArvore(100.00,200.00,"azul","Florífera");
        System.out.println(arvore);
        arvore = ArvoreFactory.obterArvore(100.00,200.00,"azul","Florífera");
        System.out.println(arvore);
        arvore = ArvoreFactory.obterArvore(100.00,200.00,"verde","Florífera");
        System.out.println(arvore);
        arvore = ArvoreFactory.obterArvore(100.00,200.00,"verde","Florífera");
        System.out.println(arvore);
        arvore = ArvoreFactory.obterArvore(100.00,200.00,"verde","Florífera");
        System.out.println(arvore);



    }

}
