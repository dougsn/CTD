package com.cadastro.service.impl;

import com.cadastro.dto.PessoaDTO;
import com.cadastro.service.ICadastroService;
import com.cadastro.service.PessoaCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroServiceImpl implements ICadastroService {

    @Autowired
    private PessoaCliente pessoaCliente;

    @Override
    public Optional<PessoaDTO> findPessoaById(Long id) {
        Optional<PessoaDTO> p;
        p = pessoaCliente.findPessoaById(id);
        if (p.isPresent()) {
            return p;
        }
        return null;
    }

    @Override
    public List<PessoaDTO> findAllPessoas() {
        return pessoaCliente.findAllPessoas();
    }

    @Override
    public Optional<PessoaDTO> addPessoa(PessoaDTO pessoa) {
        Optional<PessoaDTO> p = pessoaCliente.addPessoa(
                new PessoaDTO(
                        null,
                        pessoa.getNome(),
                        pessoa.getIdade()
                )
        );
        return p;
    }
}
