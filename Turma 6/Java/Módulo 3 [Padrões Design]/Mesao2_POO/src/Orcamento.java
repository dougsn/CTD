import java.util.List;

public class Orcamento implements Estado{
    private Reparo reparo;
    public Orcamento(Reparo reparo){
        this.reparo = reparo;
        System.out.println(reparo);
    }

    @Override
    public void valorOrcamento(double valor) {
        this.reparo.setCusto(valor);
    }

    @Override
    public void somaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Você precisa estar no estado de reparo");
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Você não pode mudar o endereço");
    }

    @Override
    public void mudarEstado() {
        // Mudar para o estado (instanciar a classe estado).
        reparo.setEstado(new Reparacao(reparo));
    }

    @Override
    public String toString() {
        return "Orçamento";
    }
}
