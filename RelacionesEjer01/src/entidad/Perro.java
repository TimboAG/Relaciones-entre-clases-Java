package entidad;

public class Perro {

    private String nombre;
    private String raza;
    private double tamano;

    public Perro(String nombre, String raza, double tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + '}';
    }

}