package com.pessoa.service.impl;

import com.pessoa.entity.Pessoa;
import com.pessoa.repository.IPessoaRepository;
import com.pessoa.service.IPessoaService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements IPessoaService {

    @Autowired
    private IPessoaRepository repository;

    @Value("${queue.pessoa.name}")
    private String queuePessoa;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Override
    public Optional<Pessoa> save(Pessoa pessoa) {
        Optional<Pessoa> p = Optional.of(repository.save(
                new Pessoa (
                        null,
                        pessoa.getNome(),
                        pessoa.getIdade()
                )
        ));
        return p;
    }

    @Override
    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    @Override
    public String sendPessoas(String pessoa) {
        rabbitTemplate.convertAndSend(queuePessoa,pessoa);
        return "Enviando pessoa: " + pessoa;
    }

    @Override
    public Optional<Pessoa> findById(Long id) {
        Optional<Pessoa> p;
        p = repository.findById(id);
        if (p.isPresent()){
            return p;
        }
        return null;
    }
}
