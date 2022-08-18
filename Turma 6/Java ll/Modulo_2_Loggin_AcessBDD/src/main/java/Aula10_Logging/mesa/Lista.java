package Aula10_Logging.mesa;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private static final Logger logger = Logger.getLogger(Lista.class);

    private List<Integer> listaInteiros = new ArrayList<>();

    public void adicionar(int inteiro){
        listaInteiros.add(inteiro);
    }

    public void media(){
        int soma = 0;
        for (int i = 0; i < listaInteiros.size(); i++){
            soma += listaInteiros.get(i);
        }
        int media = soma / listaInteiros.size();
        logger.info("A média é " + media);
    }

    public void contar() throws Exception {
        if (listaInteiros.size() > 5 && listaInteiros.size() < 10) {
            logger.info("A lista tem mais de 5 itens");
        } else if (listaInteiros.size() >= 10) {
            logger.info("A lista tem mais de 10 itens");
        } else if (listaInteiros.size() == 0) {
            logger.error("A lista é igual a 0");
            throw new Exception();
        }
    }
}
