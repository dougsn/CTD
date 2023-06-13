package com.digital.bank.api.service.impl;

import com.digital.bank.api.dto.ProdutoDTO;
import com.digital.bank.api.dto.RepositorioDTO;
import com.digital.bank.api.service.EstoqueClient;
import com.digital.bank.api.service.RepositorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RepositorioServiceImpl implements RepositorioService {

    @Autowired
    private EstoqueClient estoqueClient;

    @Override
    public Optional<ProdutoDTO> findRepositorioByIdProduct(Long id) {
        Optional<ProdutoDTO> prod;
        prod = estoqueClient.findProductsById(id);
        if (prod.isPresent()) {
            return prod;
        }
        return null;
    }

    @Override
    public RepositorioDTO findRepositoryByProduct() {
        var repositorio = new RepositorioDTO();
        repositorio.setProdutos(estoqueClient.findAllProducts());
        return repositorio;
    }

    @Override
    public Optional<ProdutoDTO> addProductByRepository(ProdutoDTO produto) {
        Optional<ProdutoDTO> prod = estoqueClient.addProduct(
                new ProdutoDTO(
                        null,
                        produto.getName(),
                        produto.getTipo(),
                        produto.getPrice()
                )
        );
        return prod;
    }
}
