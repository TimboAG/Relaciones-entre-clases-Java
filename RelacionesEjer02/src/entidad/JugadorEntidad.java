package entidad;

public class JugadorEntidad {
   private int id ;
   private String nombre; 
   private boolean mojado;

    public JugadorEntidad() {
    }

    public JugadorEntidad(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
   
}