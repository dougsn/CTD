import java.util.*;

public class Porto {
    private String nome;
    private Map<Integer,Container> containers = new TreeMap<Integer,Container>();

    public Porto(String nome) {
        this.nome = nome;
    }

    public void addContainer(Integer id, Container container){
        containers.put(id,container); // Adicionando container na lista de containers.
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Integer, Container> getContainers() {
        return containers;
    }

    public void setContainers(Map<Integer, Container> containers) {
        this.containers = containers;
    }
}
