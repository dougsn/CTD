public class Jogador extends Equipe  implements Comparable{
    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(String nome) {
        super(nome);
    }


    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
