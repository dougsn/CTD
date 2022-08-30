package com.example.Medicamentos.controller;

import com.example.Medicamentos.dao.ConfiguracaoJDBC;
import com.example.Medicamentos.dao.imp.MedicamentoDaoImp;
import com.example.Medicamentos.model.MedicamentoModel;
import com.example.Medicamentos.service.MedicamentoService;
import org.springframework.web.bind.annotation.*;


@RestController // Indicando que essa classe é o controller

@RequestMapping("/medicamentos")
// Essa anotation obriga a consumir com a URL com o começo de, por exp, http://localhost:8080/medicamentos/{salvar(Objeto) ou id)}
public class MedicamentoController {

    // Temos que instanciar o serviço para conseguirmos utilizar os métodos de salvar e buscar.
    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoImp(new ConfiguracaoJDBC()));


    // O @ResquestBody indica que o que vai chegar no body da API vai ir para a variavel do medicamentoModel

    @PostMapping("/salvar")
    public MedicamentoModel salvar(@RequestBody MedicamentoModel medicamentoModel){
        return medicamentoService.salvar(medicamentoModel);
    }

    // Cada GetMapping tem que ter uma URL específica, pois se tivermos outra, só muda a URL.
    @GetMapping("/{id}")
    public MedicamentoModel buscarPorId(@PathVariable Integer id){
        return medicamentoService.buscarPorId(id);
    }


}