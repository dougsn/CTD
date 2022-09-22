package com.example.useToken.model;

public class AuthenticationResponse { // Essa classse vai voltar com o TOKEN, necessariamente, somente para fazer o teste.

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
