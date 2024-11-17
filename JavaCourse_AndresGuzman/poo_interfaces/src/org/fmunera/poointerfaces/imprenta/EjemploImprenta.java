package org.fmunera.poointerfaces.imprenta;

import org.fmunera.poointerfaces.imprenta.modelo.*;
import static org.fmunera.poointerfaces.imprenta.modelo.Genero.*;
import static org.fmunera.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral...", new Persona("John", "Doe"), "Ingeniero de sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador Fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseños: Elem. Reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
             .addPagina(new Pagina("Patrón Obsevador"))
             .addPagina(new Pagina("Patrón Factory"))
             .addPagina(new Pagina("Patrón Composite"))
             .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Estudio sobre Microservicios", new Persona("Martin", "Fowler"), new Persona("James", "Gosling"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Implementación del método imprimir desde clase anónima...";
            }
        });


        System.out.println(TEXTO_DEFECTO);

    }

}
