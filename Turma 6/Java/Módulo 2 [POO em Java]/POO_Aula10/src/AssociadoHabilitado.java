public class AssociadoHabilitado extends Associado{
    private final double custoPiscina;
    private boolean habilitado;
    public AssociadoHabilitado(String numAssociado, String nome, Double valorMensal, String atividade, double custoPiscina) {
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
        this.habilitado = false;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public double custoMensal() {
        if(habilitado){
            return super.custoMensal() + custoPiscina;
        }
        return super.custoMensal();
    }
}
