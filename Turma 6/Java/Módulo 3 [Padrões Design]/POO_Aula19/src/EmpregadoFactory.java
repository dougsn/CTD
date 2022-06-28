import javax.xml.stream.events.Comment;

public class EmpregadoFactory {

    private static EmpregadoFactory instance; // No padrão singleton, é preciso criar umma instancia aqui primeiro e ser estatico

    // É privado, pois é necessário ser instaciado pelo getInstance.bv
    private EmpregadoFactory() {};

    //
    // metodo criar empregado vai retorar um objeto do tipo empregado. (Padrão Factory);
    public Empregado criarEmpregado(String nome,String tipo) {
        if(tipo.equals("EMP-INT")){ // se for igual a isso;
            return new EmpregadoRelacaoDep(nome);
        } else if(tipo.equals("EMP-EXT")){
            return new EmpregadoContratado(nome);
        }

        throw new RuntimeException("O tipo não existe.");
    }

    // Padrão Singleton o método precisa ser static;


    public static EmpregadoFactory getInstance(){
        if (instance == null) {
            instance = new EmpregadoFactory();
        }
        return instance;
    }


}
