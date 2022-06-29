import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PecaReposicao> pecas = new ArrayList<>();
        pecas.add(new PecaReposicao("motor",50.00));

        Reparo reparo = new Reparo("Liquidificador", 100.00);
        reparo.proximo();
        reparo.getEstado().somaReposicao(pecas);
        reparo.proximo();
        reparo.getEstado().mudarEndereco("Rua A, 1");
        reparo.proximo(); // Instannciando como finalizado

        if (reparo.getEstado() instanceof Finalizado){ // Verificando se ele está instanciando como finalizado
            System.out.println("Acaboou!!!");
        }

    }
}
