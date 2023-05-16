package com.dh.currencyconverterservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/currency")
public class CurrencyConverterServiceController {

    @GetMapping("/from/{param1}/to/{param2}")
    public ResponseEntity<String> currencyConverter(@PathVariable String param1, @PathVariable String param2){
        Random random = new Random();
        int randomNumber = random.nextInt(100); // gera um número aleatório entre 0 e 99
        return ResponseEntity.ok("A conversão do valor é: " + randomNumber);
    }

}
