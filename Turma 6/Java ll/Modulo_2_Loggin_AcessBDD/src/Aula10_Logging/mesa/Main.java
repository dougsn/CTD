package Aula10_Logging.mesa;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();

        Lista lista2 = new Lista();

        lista2.adicionar(6);
        lista2.adicionar(6);
        lista2.adicionar(6);
        lista2.adicionar(6);
        lista2.adicionar(6);
        lista2.adicionar(6);

        lista2.contar();

        Lista lista3 = new Lista();

        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);
        lista3.adicionar(10);

        lista3.contar();
        lista3.media();

        Lista lista = new Lista();

        //lista.adicionar(1);
        lista.contar();

    }
}