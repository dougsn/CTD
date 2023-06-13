package com.digital.bank.api.service;

import com.digital.bank.api.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@FeignClient("estoque-service")
public interface EstoqueClient {

    @GetMapping("estoque/v1/produto/{id}")
    Optional<ProdutoDTO> findProductsById(@PathVariable Long id);

    @GetMapping("estoque/v1/produto")
    List<ProdutoDTO> findAllProducts();

    @PostMapping("estoque/v1/produto")
    Optional<ProdutoDTO> addProduct(@RequestBody ProdutoDTO produtoDTO);



}
