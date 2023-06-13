package com.digital.bank.api.service;

import com.digital.bank.api.dto.ProdutoDTO;
import com.digital.bank.api.dto.RepositorioDTO;

import java.util.Optional;

public interface RepositorioService {
    Optional<ProdutoDTO> findRepositorioByIdProduct(Long id);
    RepositorioDTO findRepositoryByProduct();
    Optional<ProdutoDTO> addProductByRepository(ProdutoDTO produto);
}
