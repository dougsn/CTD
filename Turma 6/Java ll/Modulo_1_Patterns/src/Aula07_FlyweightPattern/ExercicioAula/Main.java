package Aula07_FlyweightPattern.ExercicioAula;

public class Main {
    public static void main(String[] args) {

        Computadores computadores = ComputadorFactory.obterComputador("16","128","1");
        System.out.println(computadores);
        computadores = ComputadorFactory.obterComputador("16","128","1");
        System.out.println(computadores);

        computadores = ComputadorFactory.obterComputador("16","128","12");
        System.out.println(computadores);

        computadores = ComputadorFactory.obterComputador("8","500","2");
        System.out.println(computadores);
        computadores = ComputadorFactory.obterComputador("8","500","2");
        System.out.println(computadores);
        computadores = ComputadorFactory.obterComputador("8","500","2");
        System.out.println(computadores);
        computadores = ComputadorFactory.obterComputador("8","500","2");
        System.out.println(computadores);

    }
}
