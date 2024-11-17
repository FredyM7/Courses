package org.fmunera.hilos.ejemplosync.runabble;

import org.fmunera.hilos.ejemplosync.Panaderia;

public class Consumidor implements Runnable{

    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

        for(int i=0; i<10; i++){

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            this.panaderia.consumir();
        }

    }
}
