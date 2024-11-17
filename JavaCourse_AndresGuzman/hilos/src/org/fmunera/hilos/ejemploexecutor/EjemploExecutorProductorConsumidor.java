package org.fmunera.hilos.ejemploexecutor;

import org.fmunera.hilos.ejemplosync.Panaderia;
import org.fmunera.hilos.ejemplosync.runabble.Consumidor;
import org.fmunera.hilos.ejemplosync.runabble.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+executor.getQueue().size());


        Panaderia panaderia = new Panaderia();
        Runnable productor = new Panadero(panaderia);
        Runnable consumidor = new Consumidor(panaderia);

        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);


        System.out.println("Tamaño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main");


    }
}
