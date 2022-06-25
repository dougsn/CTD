enum Escalacao {
    TITULAR("Jgador Titular"),
    RESERVA("Jogador Reserva"),
    SUPLENTE("Jogador Suplente");

    private String descricao;

    Escalacao(String descricao){
        this.descricao =descricao;
    }

    public String getDescricao() {
        return descricao;
    }

// No Enum, os construtores são privados, são acessados apenas pelo get, para obter os valores do construtor.
}
