package org.fmunera.app.jardin;

import org.fmunera.app.hogar.*;
import static org.fmunera.app.hogar.Persona.*;
import static org.fmunera.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {


        Persona p = new Persona();
        p.setNombre("Fredy");
        p.setApellido("Múnera");
        p.setColorPelo(NEGRO);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);

        System.out.println("jugando = " + jugando);

        String saludar = saludar();
        String generoMasculino = GENERO_MASCULINO;
        String generoFemenino = GENERO_FEMENINO;

        System.out.println("\nsaludar = " + saludar);
        System.out.println("generoMasculino = " + generoMasculino);
        System.out.println("generoFemenino = " + generoFemenino);


    }
}
