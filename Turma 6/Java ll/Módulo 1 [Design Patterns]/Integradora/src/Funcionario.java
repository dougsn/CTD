import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Vendedores {

    LocalDate antiguidade;

    List<Afiliado> afiliados = new ArrayList<Afiliado>();


    public Funcionario(String nome, int pontuacao) {
        super(nome, pontuacao);
    }


    public LocalDate getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(LocalDate antiguidade) {
        this.antiguidade = antiguidade;
    }

    // Retorna o tempo de casa do funcionario
    public void calculaAntiguidade(){
        int idade = Period.between(this.antiguidade, LocalDate.of(2022, 8, 2)).getYears();
        setPontuacao(getPontuacao() + idade * 5);

    }


    public void obterAfiliados(Afiliado a){
        this.afiliados.add(a);
        this.setPontuacao(this.getPontuacao() + 10);
    }

    public void vender(){
        this.setPontuacao(this.getPontuacao() + 5);
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
