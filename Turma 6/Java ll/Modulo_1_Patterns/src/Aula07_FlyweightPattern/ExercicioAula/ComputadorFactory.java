package Aula07_FlyweightPattern.ExercicioAula;


import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    public static Map<String, Computadores> macFlyweight = new HashMap<>();

    public  Computadores getComputador(int ram, int hd){

        String id = "id: " + ram + " : " + hd;
        System.out.println(id);


        if(!macFlyweight.containsKey(id)){ // Verifica se o ID não existe.

            macFlyweight.put(id, new Computadores(ram, hd));
            System.out.println("\nPC Criado com sucesso.");
            return macFlyweight.get(id);
        }
        System.out.println("\nPC obtido.");
        return macFlyweight.get(id);
    }


}
