import java.time.LocalDate;

public class Cachorro {

    private Boolean apto;
    private String raca;
    private Integer anoNascimento;
    private Double peso;
    private Boolean chip;
    private Boolean ferido;
    private String nome;

    public Cachorro(Boolean apto, String raca, Integer anoNascimento, Double peso, Boolean chip, Boolean  ferido, String nome){
        this.apto = apto;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.nome = nome;
    }

    public Cachorro(Double peso, Boolean chip, Boolean ferido, String nome, Integer anoNascimento){
        this.peso = peso;
        this.chip  = chip;
        this.ferido = ferido;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }



    public Boolean getApto(){
        return this.apto;
    }

    public void setApto( Boolean apto){
        this.apto = apto;
    }

    public String getRaca (){
        return this.raca;
    }

    public void setRaca( String raca){
        this.raca = raca;
    }

    public Integer getAnoNascimento(){
        return this.anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getChip() {
        return chip;
    }

    public void setChip(Boolean chip) {
        this.chip = chip;
    }

    public Boolean getFerido() {
        return ferido;
    }

    public void setFerido(Boolean ferido) {
        this.ferido = ferido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Fim do encapsulamento e inicio dos métodos

    public String idadeChip(){
        System.out.println( System.lineSeparator() +  "A idade do cachorro " + getNome() + " é " + ( LocalDate.now().getYear() - getAnoNascimento()) + " anos");


        if(getChip()){
            return "O cachorro " + getNome() + " possue chip!";
        } else {
            return "O cachorro " + getNome() + " não possue chip!";
        }

    }

    public String adocao(Boolean ferido , Double peso){
        if(ferido || peso <= 5){
            return "O cachorro " + getNome() + " não pode ser adotado!";
        } else {
            return "O cachorro " + getNome() + " pode ser adotado!";
        }
    }

}
