package org.fmunera.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Timer timer = new Timer();

        AtomicInteger contadorAtomic = new AtomicInteger(0);

        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                int i = contadorAtomic.getAndIncrement();
                if(i < 3) {
                    toolkit.beep();
                    System.out.println("Tarea "+i+" periódica en: " + new Date() + " nombre del Thread: " + Thread.currentThread().getName());
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }

            }
            
        }, 0, 10000);

        System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos ...");
    }
}
