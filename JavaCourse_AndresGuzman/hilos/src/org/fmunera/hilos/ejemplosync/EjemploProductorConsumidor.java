package org.fmunera.hilos.ejemplosync;

import org.fmunera.hilos.ejemplosync.runabble.Consumidor;
import org.fmunera.hilos.ejemplosync.runabble.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {


        Panaderia p = new Panaderia();

        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
