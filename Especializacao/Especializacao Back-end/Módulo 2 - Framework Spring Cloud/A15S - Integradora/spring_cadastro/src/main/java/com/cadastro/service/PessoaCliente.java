package com.cadastro.service;

import com.cadastro.dto.PessoaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@FeignClient("pessoa-service")
public interface PessoaCliente {

    @GetMapping("pessoa/v1/pessoa/{id}")
    Optional<PessoaDTO> findPessoaById(@PathVariable Long id);

    @GetMapping("pessoa/v1/pessoa")
    List<PessoaDTO> findAllPessoas();

    @GetMapping("pessoa/v1/pessoa/pessoas/{pessoa}")
    String findPessoas(@PathVariable String pessoa);

    @PostMapping("pessoa/v1/pessoa")
    Optional<PessoaDTO> addPessoa(@RequestBody PessoaDTO pessoaDTO);

}
