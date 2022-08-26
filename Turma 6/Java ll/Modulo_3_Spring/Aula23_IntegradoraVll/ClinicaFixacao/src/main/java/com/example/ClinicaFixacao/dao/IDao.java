package com.example.ClinicaFixacao.dao;

public interface IDao<T>{

    public T salvar(T t);
    public T buscar(Integer id);

}
