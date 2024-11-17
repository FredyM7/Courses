package org.fmunera.hilos.ejemplos.runnable;

import static org.fmunera.hilos.ejemplos.EjemploSincronizacionThread.imprimirFrase;

public class ImprimirFrases implements Runnable{

    private String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {

        imprimirFrase(frase1, frase2);
    }
}
