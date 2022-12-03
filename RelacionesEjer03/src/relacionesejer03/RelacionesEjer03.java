package relacionesejer03;

import Servicio.BarajaServicio;
import Entidad.CartaEntidad;
import java.util.ArrayList;

public class RelacionesEjer03 {

    public static void main(String[] args) {
        BarajaServicio miServicio = new BarajaServicio();
        ArrayList<CartaEntidad> miArray = miServicio.inicio();
        miServicio.mostrar(miArray);
    }

}