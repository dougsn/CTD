package com.example.Filmes.exceptions;

public class BadRequestException extends Exception{
    public BadRequestException(String msg){
        super(msg);
    }
}
