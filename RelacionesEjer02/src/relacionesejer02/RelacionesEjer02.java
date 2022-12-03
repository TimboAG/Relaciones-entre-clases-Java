package relacionesejer02;

import entidad.JugadorEntidad;
import entidad.RevolverEntidad;
import java.util.ArrayList;
import servicio.JugadorServicio;
import servicio.JuegoServicio;
import servicio.RevolverServicio;

public class RelacionesEjer02 {

    public static void main(String[] args) {
        RevolverServicio miSevicioRevolver = new RevolverServicio();
        RevolverEntidad miRevolver = miSevicioRevolver.llenarRevolver();
        JugadorServicio miServicioJugador = new JugadorServicio();
        JuegoServicio miServicioJuego = new JuegoServicio();
        ArrayList<JugadorEntidad> miArrayList = miServicioJugador.inicio();
        miServicioJuego.llenarJuego(miArrayList, miRevolver);
        System.out.println("LOS JUGADORES SON:");
        miServicioJugador.mostrar(miArrayList);
        System.out.println(" ");
        System.out.println("EMPIEZA EL JUEGO!!!");
        miServicioJuego.ronda(miArrayList, miRevolver);
    }

}