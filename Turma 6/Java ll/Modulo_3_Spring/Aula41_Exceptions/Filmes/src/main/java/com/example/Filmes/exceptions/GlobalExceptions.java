package com.example.Filmes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // Vai fazer o tratamento de error Globalmente.
public class GlobalExceptions {

    // É necessário criar um método para retornar um status de erro, conforme a EXCEPTIONS criada.

    @ExceptionHandler // Vai utilizar essa configuração para fazer o tratamento do erro.
    public ResponseEntity<String> processarErrorNotFound(ResourceNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage() + " Globaaal..");
    }
}
