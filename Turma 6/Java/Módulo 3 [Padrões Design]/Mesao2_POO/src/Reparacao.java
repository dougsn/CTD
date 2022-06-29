import java.util.List;

public class Reparacao implements Estado{

    private Reparo reparo;

    public Reparacao(Reparo reparo){
        this.reparo = reparo;
        System.out.println(reparo);
    }

    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Valor já informado");
    }

    @Override
    public void somaReposicao(List<PecaReposicao> pecas) {
        double soma = 0;

        for (PecaReposicao peca: pecas){
            soma += peca.getValor();
        }

        reparo.setCusto(reparo.getCusto() + soma);

    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Não pode mudar endereço");
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Envio(reparo));
    }

    @Override
    public String toString() {
        return "Reparação";
    }
}
