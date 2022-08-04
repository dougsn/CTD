package Aula04_ChainOfResponsibilityPatterns;
public class Tecnico extends Gerenciador{
    @Override
    public void verificar(Mail mail) {

        if(mail.getDestino().equalsIgnoreCase("tecnico@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Tecnico")){
            System.out.println("Enviando ao departamente Tecnico");
        } else {
            if (this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }

    }
}
