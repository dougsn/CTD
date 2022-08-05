package Aula07_FlyweightPattern;

public class Main {

    public static void main(String[] args) {

        Circulo circulo =  FlyweightFactory.obterCirculo("Azul");
        circulo.setRaio(5);
        circulo.setTamanho("9");

        circulo.desenhar();
        circulo = FlyweightFactory.obterCirculo("Azul");
        circulo.desenhar();

        circulo = FlyweightFactory.obterCirculo("Amarelo");
        circulo.desenhar();
        circulo = FlyweightFactory.obterCirculo("Amarelo");
        circulo.desenhar();

        circulo = FlyweightFactory.obterCirculo("Vermelho");
        circulo.desenhar();
        circulo = FlyweightFactory.obterCirculo("Vermelho");
        circulo.desenhar();

    }

}
