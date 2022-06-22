public class ClienteException extends Exception{

    public ClienteException(){

    }

    public ClienteException(String mensagem){
        super(mensagem);
    }


    @Override
    public String toString() {
        return "ClienteExpeption" + super.toString();
    }
}
