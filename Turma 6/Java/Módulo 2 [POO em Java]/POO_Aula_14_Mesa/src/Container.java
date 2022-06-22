public class Container {
    private int id;
    private String descricao;
    private String pais;
    private boolean marca;


    public Container(int id, String descricao, String pais, boolean marca) {
        this.id = id;
        this.descricao = descricao;
        this.pais = pais;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean getMarca() {
        return marca;
    }

    public void setMarca(boolean marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return
                "  id:" + id +
                ", descricao: " + descricao + '\'' +
                ", pais: " + pais + '\'' +
                ", marca: " + marca + '\n';
    }
}
