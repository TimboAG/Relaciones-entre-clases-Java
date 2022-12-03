package entidad;

import java.util.ArrayList;
import java.util.HashMap;

public class AdopcionEntidad {

    private HashMap<PerroEntidad, PersonaEntidad> adoptados;
    private ArrayList<PersonaEntidad> personas;
    private ArrayList<PerroEntidad> perros;

    public AdopcionEntidad() {
    }

    public AdopcionEntidad(HashMap<PerroEntidad, PersonaEntidad> adoptados, ArrayList<PersonaEntidad> personas, ArrayList<PerroEntidad> perros) {
        this.adoptados = adoptados;
        this.personas = personas;
        this.perros = perros;
    }

    public HashMap<PerroEntidad, PersonaEntidad> getAdoptados() {
        return adoptados;
    }

    public void setAdoptados(HashMap<PerroEntidad, PersonaEntidad> adoptados) {
        this.adoptados = adoptados;
    }

    public ArrayList<PersonaEntidad> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<PersonaEntidad> personas) {
        this.personas = personas;
    }

    public ArrayList<PerroEntidad> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<PerroEntidad> perros) {
        this.perros = perros;
    }

}