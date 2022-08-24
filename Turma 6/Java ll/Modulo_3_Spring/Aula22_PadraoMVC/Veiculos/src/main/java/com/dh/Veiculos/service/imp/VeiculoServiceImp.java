package com.dh.Veiculos.service.imp;

import com.dh.Veiculos.model.Veiculo;
import com.dh.Veiculos.service.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImp implements VeiculoService {
    @Override
    public List<Veiculo> listaVeiculos() {
        return Arrays.asList(new Veiculo("Fiat","Azul"), new Veiculo("Chevrolet","Onix"));
    }
}
