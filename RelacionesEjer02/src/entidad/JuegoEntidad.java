package entidad;

import java.util.ArrayList;

public class JuegoEntidad {

    private ArrayList<JugadorEntidad> jugadores;
    private RevolverEntidad revolver;

    public JuegoEntidad() {
    }

    public JuegoEntidad(ArrayList<JugadorEntidad> jugadores, RevolverEntidad revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<JugadorEntidad> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadorEntidad> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverEntidad getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverEntidad revolver) {
        this.revolver = revolver;
    }

}