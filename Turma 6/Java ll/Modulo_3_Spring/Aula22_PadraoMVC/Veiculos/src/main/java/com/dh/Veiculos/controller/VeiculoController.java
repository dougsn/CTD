package com.dh.Veiculos.controller;

import com.dh.Veiculos.model.Veiculo;
import com.dh.Veiculos.service.VeiculoService;
import com.dh.Veiculos.service.imp.VeiculoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listaveiculos")

public class VeiculoController {

    private final VeiculoService veiculoService;

    @Autowired // Vinculo com o serviço

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping
    public List<Veiculo> listaVeiculos(){
        return veiculoService.listaVeiculos();
    }

}
