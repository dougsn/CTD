import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Pessoa {

    private final String nome;
    private final int idade;
    List<Pessoa> pessoaList = new ArrayList<>();

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void addPessoa(Pessoa pessoa){
        pessoaList.add(pessoa);
    }

    public Supplier<String> verificarIdade(){
        if(getNome().length() >= 5 && getIdade() > 18){
            addPessoa(this);
        }
        return null;
    }

    @Override
    public String toString() {
        return  "nome:'" + nome + '\'' +
                ", idade:" + idade;
    }
}
