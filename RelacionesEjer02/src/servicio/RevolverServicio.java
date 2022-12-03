package servicio;

import entidad.RevolverEntidad;

public class RevolverServicio {

    public RevolverEntidad llenarRevolver() {
        RevolverEntidad miRevolver = new RevolverEntidad();
        int aleatorio;
        aleatorio = (int) (Math.random() * 6);
        miRevolver.setPosicionActual(aleatorio);
        aleatorio = (int) (Math.random() * 6);
        miRevolver.setPosicionAgua(aleatorio);
        return miRevolver;
    }

    public boolean mojar(RevolverEntidad m) {
        boolean es;
        if (m.getPosicionActual() == m.getPosicionAgua()) {
            es = true;
        } else {
            es = false;
        }
        return es;
    }

    public void siguienteChorro(RevolverEntidad m) {
        if (m.getPosicionAgua() != m.getPosicionActual()) {
            m.setPosicionActual((int) (Math.random() * 6));
        } else {
            mojar(m);
            m.setPosicionActual((int) (Math.random() * 6));
        }
    }

    public void mostrar(RevolverEntidad m) {
        System.out.println(m.toString());
    }
}