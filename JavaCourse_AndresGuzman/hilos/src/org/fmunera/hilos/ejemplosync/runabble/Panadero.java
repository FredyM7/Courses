package org.fmunera.hilos.ejemplosync.runabble;

import org.fmunera.hilos.ejemplosync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{

    private Panaderia panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

        for(int i=0; i<10; i++){
            this.panaderia.hornear("Pan n°: "+i);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
