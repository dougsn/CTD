package Aula03_Integradora;

public class Afiliado extends Vendedor {


    public Afiliado(String nome, int pontuacao) {
        super(nome, pontuacao);
    }

    public void vender(){
        this.setPontuacao(this.getPontuacao() + 15);
    }

    @Override
    public String mostrarCategoria() {
        return super.mostrarCategoria();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Categoria: " + mostrarCategoria();
    }
}
