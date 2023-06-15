package com.cadastro.service;

import com.cadastro.dto.PessoaDTO;

import java.util.List;
import java.util.Optional;

public interface ICadastroService {
    Optional<PessoaDTO> findPessoaById(Long id);
    List<PessoaDTO> findAllPessoas();
    String findPessoas(String pessoa);
    Optional<PessoaDTO> addPessoa(PessoaDTO pessoa);
}
