package Aula14_PadraoDAO.Aula;

public interface IDao<T> { // Criando uma interface genérica, o tipo dela é definida quando for utilizada.

    public T salvar(T t); // Salvando pelo tipo que será realizado de forma generica
    public T buscar(Integer id); //Buscando pela ID (Primary key).

}

// O padrão DAO consiste em criar uma INTERFACE GENERICA que pode ser utilizada em qualquer classe, para que se adapte aos seus "TIPOS" e faça as manipulaçõões conforme o método da INTERFACE.