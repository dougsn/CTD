package Aula07_FlyweightPattern.Mesa;

import Aula07_FlyweightPattern.Circulo;

import java.util.HashMap;

public class ArvoreFactory {

    private static final HashMap<String, Arvore> floresta = new HashMap<>();



    public static Arvore obterArvore(Double altura, Double largura, String cor, String tipo){

        Arvore arvore = floresta.get(tipo);


        if(arvore == null) {
            arvore = new Arvore(altura, largura, cor, tipo);
            floresta.put(tipo,arvore);
            System.out.println("Criando uma nova arvore: " + arvore);
        }

        return arvore;
    }
}
