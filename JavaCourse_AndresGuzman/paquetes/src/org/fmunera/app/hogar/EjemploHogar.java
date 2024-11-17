package org.fmunera.app.hogar;

import org.fmunera.app.jardin.*;
import static org.fmunera.app.hogar.Persona.*;

public class EjemploHogar {
    public static void main(String[] args) {

        Persona p = new Persona();
        Perro perro =  new Perro();

        String saludo = saludar();

        System.out.println("\nsaludo = " + saludo);

        //No se puede invocar este método de perro, ya que es default en su contexto, solo se podría usar en (jardín)//perro.jugar();
        //Mensaje de error del IDE: 'jugar(org.fmunera.app.hogar.Persona)' is not public in 'org.fmunera.app.jardin.Perro'. Cannot be accessed from outside package
    }
}
