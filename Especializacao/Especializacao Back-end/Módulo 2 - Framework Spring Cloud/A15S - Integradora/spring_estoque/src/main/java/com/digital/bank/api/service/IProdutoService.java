package com.digital.bank.api.service;

import com.digital.bank.api.entity.Produto;

import java.util.List;
import java.util.Optional;

public interface IProdutoService {
    Optional<Produto> save(Produto produto);
    List<Produto> findAll();
    Optional<Produto> findById(Long id);
}
