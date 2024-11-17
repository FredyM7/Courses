package org.fmunera.poointerfaces.imprenta.modelo;

public interface Imprimible {

    String imprimir();

    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    static void imprimir(Imprimible imprimible){
        System.out.println("\n"+imprimible.imprimir());
    }
}
