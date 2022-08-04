package Aula04_ChainOfResponsibilityPatterns;
public class ProcessMail {

    public static void main(String args[]){

        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com","tecnico@digitalhouse.com","Reclamação"));
        processo.verificar(new Mail("email@email.com","sds@digitalhouse.com","Gerência"));
        processo.verificar(new Mail("email@email.com","juan@pepelegal.com","Comercial"));
        processo.verificar(new Mail("email@email.com","tecnico@colmeia.com","Reclamação"));



    }

}
