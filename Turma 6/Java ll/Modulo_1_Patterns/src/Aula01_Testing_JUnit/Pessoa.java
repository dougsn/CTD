package Aula01_Testing_JUnit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    LocalDate idade;
    List<String> pessoaList = new ArrayList<String>();

    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<String> addNome(Pessoa p){
        int contador = p.getNome().length();
        int idade = p.Idade();
        if(contador >= 5 && idade >= 18){
            pessoaList.add(p.getNome());
            System.out.println(pessoaList);
        }
        return null;
    }

    public int Idade(){
        // Aqui compara a data atual (que foi criada na mão) com a data de nascimento da pessoa instanciada.
        int idade = Period.between(this.idade, LocalDate.of(2022,8,1)).getYears(); // Fazendo o calculo para retornar a idade. Está pegando pelo ao .getYears();
        return idade;
    }

    @Override
    public String toString() {
        return  "nome:'" + nome + '\'' +
                ", sobrenome:'" + sobrenome + '\'' +
                ", idade:" + idade;
    }
}
