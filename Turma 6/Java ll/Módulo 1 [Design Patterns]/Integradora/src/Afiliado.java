public class Afiliado extends Vendedores{


    public Afiliado(String nome, int pontuacao) {
        super(nome, pontuacao);
    }

    public void vender(){
        this.setPontuacao(this.getPontuacao() + 15);
    }

    @Override
    public String mostrarCategoria() {

        if(getPontuacao() < 20){
            return "Novato";
        } else if(getPontuacao() >= 20 && getPontuacao() <= 30 ){
            return "Aprendiz";
        } else if(getPontuacao() >= 31 && getPontuacao() <= 40 ){
            return "Bom";
        } else {
            return "Mestre";
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome: " + getNome() +
                ", Pontuacao: " + getPontuacao() +
                ", Categoria: " + mostrarCategoria() +
                '}';
    }
}
