package com.example.Clinica2.dao;

public interface IDao<T> {

    public T salvar (T t);
    public T buscar (Integer id);

    public String deletar (Integer id);

}
