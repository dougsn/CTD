public class UsuarioJogo {

    String nome;
    private String nickname;
    private Integer pontuacao = 0;
    private Integer nivel = 0;


    public UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
    }

    public String  getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public Integer getPontuacao(){
        return this.pontuacao;
    }

    public void setPontuacao(Integer pontuacao){
        this.pontuacao = pontuacao;
    }

    public Integer getNivel() {
        return this.nivel;
    }

    public void setNivel(Integer nivel){
        this.nivel = nivel;
    }



    public void aumentarPontuacao(){
        this.pontuacao += 1;
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public void bonus(Integer valor){
        this.pontuacao += valor;
    }


}
