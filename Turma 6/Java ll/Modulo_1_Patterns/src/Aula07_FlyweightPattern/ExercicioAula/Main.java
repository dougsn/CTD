package Aula07_FlyweightPattern.ExercicioAula;

public class Main {
    public static void main(String[] args) {

        ComputadorFactory computer = new ComputadorFactory();

        Computadores mac1 = computer.getComputador(16,500);
        Computadores windows = computer.getComputador(2,256);
        Computadores mac2 = computer.getComputador(16,500);

        System.out.println(mac2);
        System.out.println(mac1);
        System.out.println(windows);

    }
}
