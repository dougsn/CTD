import java.util.*;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {

        Container container1 = new Container(1,"descricao1","Desconhecido",true);
        Container container2 = new Container(2,"descricao2","EUA",false);

        Container container3 = new Container(3,"descricao3","China",true);
        Container container4 = new Container(4,"descricao4","Desconhecido",false);


        Porto porto1 = new Porto("Porto Mocangue");

        porto1.addContainer(container1.getId(),container1);
        porto1.addContainer(container2.getId(),container2);


        porto1.addContainer(container4.getId(),container4);
        porto1.addContainer(container3.getId(),container3);


        // Obtendo o conjunto de entrada do TreeMap e Usando o método entrySet
        Set<Map.Entry<Integer,Container> > entrySet = porto1.getContainers().entrySet();
        // Convertendo entrySet para ArrayList
        List<Map.Entry<Integer, Container> > entryList = new ArrayList<>(entrySet);


        int contador = 0;
        for (Map.Entry<Integer, Container> integerContainerEntry : entryList) {
//            System.out.println(entryList.get(i).getKey()); Para pegar apenas a chave

            if (integerContainerEntry.getValue().getPais() == "Desconhecido") {
                contador = contador + 1;
            }
        }

        System.out.println( "A quantidade de contêiners perigosos é: " + contador);
        System.out.println(porto1.getContainers().toString());


}
}

