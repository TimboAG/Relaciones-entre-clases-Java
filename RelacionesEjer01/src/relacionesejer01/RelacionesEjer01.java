package relacionesejer01;

import entidad.Persona;
import servicio.PersonaPerroServicio;

public class RelacionesEjer01 {

    public static void main(String[] args) {
        PersonaPerroServicio miServicio = new PersonaPerroServicio();
        Persona mi = miServicio.crearPersona();
        miServicio.mostrar(mi);

    }
}