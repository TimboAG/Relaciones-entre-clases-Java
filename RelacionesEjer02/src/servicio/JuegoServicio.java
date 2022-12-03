package servicio;

import entidad.JugadorEntidad;
import entidad.RevolverEntidad;
import java.util.ArrayList;
import entidad.JuegoEntidad;

import java.util.Iterator;

public class JuegoServicio {

    public JuegoEntidad llenarJuego(ArrayList<JugadorEntidad> jugadores, RevolverEntidad r) {
        JuegoEntidad miJuego = new JuegoEntidad();
        miJuego.setJugadores(jugadores);
        miJuego.setRevolver(r);
        return miJuego;
    }

    public void ronda(ArrayList<JugadorEntidad> jugadores, RevolverEntidad r) {
        JugadorServicio miServicio = new JugadorServicio();
        RevolverServicio miRevolver = new RevolverServicio();
        int cont = 1;
        System.out.println("--------------RONDA-------------" + cont);
        miRevolver.mostrar(r);
        miServicio.mostrar(jugadores);
        while (jugadores.size() != 1) {
            Iterator<JugadorEntidad> miIterator = jugadores.iterator();
            miServicio.disparo(r, jugadores);
            while (miIterator.hasNext()) {
                if (miIterator.next().getMojado() == true) {
                    miIterator.remove();
                    break;
                }
            }
            cont = cont + 1;
            System.out.println("--------------RONDA-------------" + cont);
            miRevolver.mostrar(r);
            miServicio.mostrar(jugadores);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------EL GANADOR ES:---------------");
        miServicio.mostrar(jugadores);
    }

}