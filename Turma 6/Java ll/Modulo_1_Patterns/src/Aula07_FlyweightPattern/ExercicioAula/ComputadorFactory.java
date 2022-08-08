package Aula07_FlyweightPattern.ExercicioAula;

import java.util.HashMap;

public class ComputadorFactory {

    public static final HashMap<String, Computadores> computadoresHashMap = new HashMap<>();

    public static Computadores obterComputador(String ram, String hd, String id){

        Computadores computadores = computadoresHashMap.get(id);

        if(computadores == null){

            computadores = new Computadores(ram, hd, id);
            computadoresHashMap.put(id, computadores);
            System.out.println("Criado um novo computador: " + computadores);
            computadores.setContador(computadores.getContador() + 1);


        }
        return computadores;
    }


}
