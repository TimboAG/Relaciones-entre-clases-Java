package relacionesejerextra01;

import entidad.PerroEntidad;
import entidad.PersonaEntidad;
import servicio.PersonaPerroServicio;
import java.util.ArrayList;
import java.util.HashMap;

public class RelacionesEjerExtra01 {

    public static void main(String[] args) {
        PersonaPerroServicio miServicio = new PersonaPerroServicio();
        ArrayList<PersonaEntidad> miPersona = miServicio.crearListaPersona();
        ArrayList<PerroEntidad> miPerro = miServicio.crearListaPerros();
        System.out.println("LOS PERROS A ADOPTAR SON:");
        miServicio.mostrarPerros(miPerro);
        HashMap<PerroEntidad, PersonaEntidad> adoptados = miServicio.adopcion(miPersona, miPerro);
        System.out.println("LOS PERROS ADOPTADOS SON:");
        miServicio.perrosAdoptados(adoptados);
    }
}