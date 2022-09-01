package com.example.Injecao_Dependencia.service;

import java.util.List;

public interface ILivroService<T>{

    public List<T> buscarTodosLivros();

}
