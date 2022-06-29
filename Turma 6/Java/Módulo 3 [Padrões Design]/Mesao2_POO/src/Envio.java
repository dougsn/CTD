import java.util.List;

public class Envio implements Estado{

    private Reparo reparo;

    public Envio(Reparo reparo){ // É feito assim, para quanndo forem utilizar essa clase para mudar de estado, receber o estado atual.
        this.reparo = reparo;
        System.out.println(reparo);
    }


    @Override
    public void valorOrcamento(double valor) {
    throw new IllegalStateException("Orçamento já foi informado");
    }

    @Override
    public void somaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Soma de peças já foi informado");
    }

    @Override
    public void mudarEndereco(String endereco) {
        reparo.setEndereco(endereco);
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Finalizado(reparo));
    }

    @Override
    public String toString() {
        return "Envio";
    }
}
