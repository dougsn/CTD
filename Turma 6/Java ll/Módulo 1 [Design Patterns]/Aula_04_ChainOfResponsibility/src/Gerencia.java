public class Gerencia extends Gerenciador{



    @Override
    public void verificar(Mail mail) {
        // o equalsIgnoreCase ignora maiusculo e minusculo.
        if(mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com") || (mail.getAssunto().equalsIgnoreCase("Gerência")))
        {
            System.out.println("Enviando ao departamente Gerencial");
        }
        else {
            if (this.getGerenciadorSeguinte() != null){ // Se o e-mail for diferente de nulo, pega para verificar o e-mail novamente.
// Vai fazendo um Loop para verificar se o próximo e-mail é do departamento Gerencial, se for faz a lógica verificar (acima), caso não seja, vem para o else
// Esse Loop é a caracteristica do ChaiOfResponsability (Corrente de Responsabilidade).

                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}
