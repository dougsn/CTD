package Aula07_FlyweightPattern.ExercicioAula;

public class Computadores {

    private String ram;
    private String hd;
    private String id;
    private int contador = 0;

    public Computadores(String ram, String hd, String id) {
        this.ram = ram;
        this.hd = hd;
        this.id = id;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Computadores{" +
                "ram='" + ram + '\'' +
                ", hd='" + hd + '\'' +
                ", id='" + id + '\'' +
                ", contador=" + contador +
                '}';
    }
}
