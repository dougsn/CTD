package com.example.MongoDB2.service;

import com.example.MongoDB2.model.ProdutoModel;
import com.example.MongoDB2.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoModel salvar(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> buscarTodos(){
        return produtoRepository.findAll();
    }


}
