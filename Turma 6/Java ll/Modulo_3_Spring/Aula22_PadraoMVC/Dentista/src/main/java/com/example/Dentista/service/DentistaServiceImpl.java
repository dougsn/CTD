package com.example.Dentista.service;

import com.example.Dentista.model.Dentista;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service // Essa anotação sinalizao ao Spring que é um Serviço
class DentistaServiceImpl implements DentistaService {

    @Override
    public List<Dentista> listaDentista() {
        return Arrays.asList(new Dentista("Maria"), new Dentista("João"));
    }
}
