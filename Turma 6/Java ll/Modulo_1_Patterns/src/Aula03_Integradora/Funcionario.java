package Aula03_Integradora;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Vendedor {

    LocalDate antiguidade;

    List<Afiliado> afiliados = new ArrayList<>();


    public Funcionario(String nome, int pontuacao) {
        super(nome, pontuacao);
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
        return super.mostrarCategoria();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Categoria: " + mostrarCategoria();
    }
}
