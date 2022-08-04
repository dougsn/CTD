package Aula04_ChainOfResponsibilityPatterns;
public abstract class Gerenciador {

    protected Gerenciador gerenciadorSeguinte;

    public Gerenciador getGerenciadorSeguinte(){
        return this.gerenciadorSeguinte;
    }

    public void setGerenciadorSeguinte(Gerenciador m){
        this.gerenciadorSeguinte = m;
    }

    public abstract void verificar(Mail mail);

}
