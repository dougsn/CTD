package com.digital.bank.api.service.impl;

import com.digital.bank.api.entity.Produto;
import com.digital.bank.api.repository.IProdutoRepository;
import com.digital.bank.api.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements IProdutoService {

    @Autowired
    private IProdutoRepository repository;


    @Override
    public Optional<Produto> save(Produto produto) {
        Optional<Produto> prod = Optional.of(repository.save(
                new Produto(
                        null,
                        produto.getName(),
                        produto.getTipo(),
                        produto.getPrice()
                )
        ));
        return prod;
    }

    @Override
    public List<Produto> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Produto> findById(Long id) {
        Optional<Produto> prod;
        prod = repository.findById(id);
        if (prod.isPresent()) {
            return prod;
        }
        return null;
    }
}
