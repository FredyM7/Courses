package org.fmunera.hilos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduledExecutorService {
    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main...");

        executor.schedule(() -> {

            try {
                TimeUnit.MILLISECONDS.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Hola mundo tarea ...");

        }, 2000, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea en el main ...");

        executor.shutdown();


    }
}
