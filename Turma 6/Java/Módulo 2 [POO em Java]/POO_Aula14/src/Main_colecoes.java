import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("------ArrayList---------");

        List arrayList = new ArrayList();
        arrayList.add("Juan");
        arrayList.add("Mario");
        arrayList.add("Carlos");
        arrayList.add("Marcelo");
        arrayList.add("Marcelo");



        System.out.println("------Percorrendo ArrayList---------");
        int i = 0;
        for(i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("------Percorrendo ArrayList con Iterator---------");

        Iterator iterador = arrayList.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("------Percorrendo ArrayList con ForEach---------");

        for(Object o: arrayList) {
            System.out.println(o);
        }



        System.out.println("-------LinkedList--------");

        List linkedList = new LinkedList();
        linkedList.add("Juan");
        linkedList.add("Mario");
        linkedList.add("Carlos");
        linkedList.add("Marcelo");
        linkedList.add("Marcelo");

        for(Object o :linkedList) {
            System.out.println((String)o);
        }



        System.out.println("-------HashSet--------");

        Set hashset = new HashSet();
        hashset.add("Juan");
        hashset.add("Mario");
        hashset.add("Carlos");
        hashset.add("Marcelo");
        hashset.add("Marcelo");






        for(Object o :hashset) {
            System.out.println((String)o);
        }

        System.out.println("--------LinkedHashSet-------");


        Set linkedhashset = new LinkedHashSet();
        linkedhashset.add("Juan");
        linkedhashset.add("Mario");
        linkedhashset.add("Carlos");
        linkedhashset.add("Marcelo");
        linkedhashset.add("Marcelo");

        for(Object o :linkedhashset) {
            System.out.println((String)o);
        }


        System.out.println("--------TreeSet-------");


        Set treeset = new TreeSet();
        treeset.add("Juan");
        treeset.add("Mario");
        treeset.add("Carlos");
        treeset.add("Marcelo");
        treeset.add("Marcelo");



        for(Object o :treeset) {
            System.out.println((String)o);
        }



        System.out.println("--------HashMap-------");

        Map hashmap = new HashMap();
        hashmap.put(29888999,"Juan");
        hashmap.put(30888999,"Mario");
        hashmap.put(27888999,"Carlos");
        hashmap.put(40888999,"Marcelo");
        hashmap.put(50888999,"Marcelo");


        System.out.println("--------Obter o nome do cpf 27888999 -------");
        System.out.println(hashmap.get(27888999));

        System.out.println("--------Percorrendo -------");
        for(Object o :hashmap.values()) {
            System.out.println((String)o);
        }



        System.out.println("--------LinkedHashMap-------");

        Map linkedhashmap = new LinkedHashMap();
        linkedhashmap.put(29888999,"Juan");
        linkedhashmap.put(30888999,"Mario");
        linkedhashmap.put(27888999,"Carlos");
        linkedhashmap.put(40888999,"Marcelo");
        linkedhashmap.put(50888999,"Marcelo");


        System.out.println("--------Obter o nome do cpf 27888999 -------");
        System.out.println(linkedhashmap.get(27888999));

        System.out.println("--------Percorrendo -------");
        for(Object o :linkedhashmap.values()) {
            System.out.println((String)o);
        }


        System.out.println("--------TreeMap-------");

        Map treemap = new TreeMap();
        treemap.put(29888999,"Juan");
        treemap.put(30888999,"Mario");
        treemap.put(27888999,"Carlos");
        treemap.put(40888999,"Marcelo");
        treemap.put(50888999,"Marcelo");


        System.out.println("--------Obter o nome do cpf 27888999 -------");
        System.out.println(treemap.get(27888999));

        System.out.println("--------Percorrendo -------");
        for(Object o :treemap.values()) {
            System.out.println((String)o);
        }




    }
}