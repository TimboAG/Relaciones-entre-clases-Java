package Entidad;

import java.util.ArrayList;

public class BarajaEntidad {

    ArrayList<CartaEntidad> baraja;

    public BarajaEntidad() {
    }

    public BarajaEntidad(ArrayList<CartaEntidad> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<CartaEntidad> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<CartaEntidad> baraja) {
        this.baraja = baraja;
    }

}