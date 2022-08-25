package com.example.Clinica.Dao;

public interface IDao<T> {

    public T cadastrar (T t);
    public T buscar (Integer id);
    public void deletar (Integer id);


}
