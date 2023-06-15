package com.pessoa.service;

import com.pessoa.entity.Pessoa;

import java.util.List;
import java.util.Optional;

public interface IPessoaService {
    Optional<Pessoa> save(Pessoa pessoa);
    List<Pessoa> findAll();
    String sendPessoas(String pessoa);
    Optional<Pessoa> findById(Long id);
}
