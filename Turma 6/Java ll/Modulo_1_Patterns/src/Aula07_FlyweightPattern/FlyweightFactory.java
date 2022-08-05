package Aula07_FlyweightPattern;

import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<String, Circulo> circuloMap = new HashMap<>();
    // O HashMap vai servir como a memória, onde o circulo que já foi criado de determinada cor vai ficar salvo.
    // Vai ser a memória onde o sistema vai acessar, para poder buscar uma informação que já existe.

    public static Circulo obterCirculo(String cor){ // Método para a criação ou reaproveitamento do objeto.

        Circulo circulo = circuloMap.get(cor); // Atribui ao circulo a cor que se encontra na "memória'.

        if(circulo == null){ // Se não tiver a cor, cria um objeto novo, com a cor solicitada e atualiza a "memória"
            circulo = new Circulo(cor);
            circuloMap.put(cor,circulo); // Atualizando o objeto com a cor nova na memória.
            System.out.println("Criado um circulo de cor: " + cor);

        }

        return circulo;

    }



}
