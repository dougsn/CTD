public class Comercial extends Gerenciador{




    @Override
    public void verificar(Mail mail) {
        // o equalsIgnoreCase ignora maiusculo e minusculo.
        if(mail.getDestino().equalsIgnoreCase("comercial@colmeia.com") || (mail.getAssunto().equalsIgnoreCase("Comercial")))
        {
            System.out.println("Enviando ao departamente Comercial");
        }
        else {
            if (this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}
