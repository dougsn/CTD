package Aula18_Maven.Paciente;

public interface IDao<T> {

    public T cadastrar(T t);

    public T buscar(int id);

    public T deletar(int id);

    public T modificar(int id);

}

 //cadastrá-los, buscá-los, excluí-los e modificá-los.