package org.fmunera.hilos.ejemplosync;

import org.fmunera.hilos.ejemplosync.runabble.Consumidor;
import org.fmunera.hilos.ejemplosync.runabble.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {


        Panaderia p = new Panaderia();

        /*Runnable panadero = () -> {

            for(int i=0; i<10; i++){
                p.hornear("Pan n°: "+i);
            }
        };

        Runnable consumidor = () -> {

            for(int i=0; i<10; i++){

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                p.consumir();
            }
        };*/

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                p.hornear("Pan n°: "+i);

            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                p.consumir();
                System.out.println();
            }

        }).start();
    }
}
