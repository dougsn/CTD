package Aula05_ProxyPatterns.Mesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario a1;
    Usuario a2;
    Usuario a3;

    Download download = new ServicoDownloadProxy();

    @BeforeEach
    void cadastroUsuario(){
        a1 = new Usuario("dougsn","Premium");
        a2 = new Usuario("Guerreiro","Basic");
        a3 = new Usuario("Arthur","premium");
    }

    @Test

    void mainTest(){
        download.downloadMusica(a1.getIdentificador(), a1.getTipo());
        System.out.println(a1);
        download.downloadMusica(a2.getIdentificador(), a2.getTipo());
        System.out.println(a2);
        download.downloadMusica(a3.getIdentificador(), a3.getTipo());
        System.out.println(a3);
    }

}