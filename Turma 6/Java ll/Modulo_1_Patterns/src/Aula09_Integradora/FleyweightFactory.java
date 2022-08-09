package Aula09_Integradora;

import java.util.HashMap;

public class FleyweightFactory {

    public static final HashMap<String, Triangulo> trianguloMap = new HashMap<>();

    public static Triangulo obterTriangulo(String cor){

        Triangulo triangulo = trianguloMap.get(cor);

        if(triangulo == null){
            triangulo = new Triangulo(cor);
            trianguloMap.put(cor,triangulo);

        }

        return triangulo;

    }

}
