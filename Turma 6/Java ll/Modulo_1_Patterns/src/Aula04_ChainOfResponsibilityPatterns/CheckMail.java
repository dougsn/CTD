package Aula04_ChainOfResponsibilityPatterns;

public class CheckMail {

    Gerenciador inicial;

    public CheckMail(){
        this.inicial = new Gerencia();
        Gerenciador tecnica = new Tecnico();
        Gerenciador comercial = new Comercial();
        Gerenciador spam = new Spam();

        //Aqui está a corrente de responsabilidade.

        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnica);
        tecnica.setGerenciadorSeguinte(spam);
    }

    public void verificar(Mail mail){

        inicial.verificar(mail);
    }

}
