package Aula07_FlyweightPattern.Mesa;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static final Map<String, Arvore> arvFlyWeight = new HashMap<>();
    int i = 0;

    public Arvore getArvore(int altura, int largura, String cor){
        String id = "";

        if (altura == 200 && largura == 400 && cor == "verde"){
            id = "Ornamentais";
        }
        if (altura == 500 && largura == 300 && cor == "vermelho"){
            id = "Frutíferas";
        }
        if (altura == 100 && largura == 200 && cor == "azul"){
            id = "Florífera";
        }

        if(!arvFlyWeight.containsKey(id)){
            arvFlyWeight.put(id, new Arvore(altura, largura,cor));
            System.out.println("Árvore criada e plantada. Cor= " +cor+ ". Árvore de número= " +i);
            i++;
            return arvFlyWeight.get(id);
        }

        System.out.println("Árvore plantada. Cor= " +cor+ ". Árvore de número= " +i);
        i++;
        return arvFlyWeight.get(id);
    }
}