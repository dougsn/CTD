package com.cadastro.queue;

import com.cadastro.service.PessoaCliente;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class CadastroListener {

    @Autowired
    private PessoaCliente cliente;

    @RabbitListener(queues = {"${queue.pessoa.name}"})
    public void listen(@PathVariable String pessoa) {cliente.findPessoas(pessoa);}

}
