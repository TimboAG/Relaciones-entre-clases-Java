package servicio;

import entidad.Persona;
import entidad.Perro;
import java.util.Scanner;

public class PersonaPerroServicio {

    public Persona crearPersona() {
        Perro miPerro = new Perro();
        Persona miPersona = new Persona();   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-------------DATOS DE PERSONA--------------");
        System.out.println("Ingrese su nombre");
        miPersona.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        miPersona.setApellido(leer.next());
        System.out.println("Ingrese su edad");
        miPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese su numero de documento");
        miPersona.setDocumento(leer.nextInt());
        System.out.println("-------------DATOS DE SU PERRO--------------");
        System.out.println("Ingrese nombre:");
        miPerro.setNombre(leer.next());
        System.out.println("Ingrese la raza");
        miPerro.setRaza(leer.next());
        System.out.println("Ingrese el tamaño");
        miPerro.setTamano(leer.nextDouble());
        miPersona.setPerro(miPerro);
        return miPersona;
    }

    public void mostrar(Persona mi) {
        System.out.println("-------------DATOS PERSONA Y DE SU PERRO--------------");
        System.out.println(mi.toString());
    }
}