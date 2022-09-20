package com.example.SpringSecurityAula.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // Essa classe é de configuração
public class PasswordEncoder {

    // O BEAN é um método da classe que terá que ser executado logo no começo da aplicação.
    // Pois eu preciso do encoder logo no começo, antes de acessar o meu sistema, porque quando eu mandar meu usuario ele vai pegar o Encoder para verificar se a senha
    // é a mesma que está salva no banco de dados.

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
