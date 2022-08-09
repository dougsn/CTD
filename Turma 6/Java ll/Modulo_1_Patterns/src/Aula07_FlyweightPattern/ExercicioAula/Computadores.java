package Aula07_FlyweightPattern.ExercicioAula;

public class Computadores {

    private int ram;
    private int hd;
    private static int contador;


    public Computadores(int ram, int hd){
        super();
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("\nContador: " + contador );


    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computadores{" +
                "ram='" + ram + '\'' +
                ", hd='" + hd + '\'' +
                '}';
    }
}
