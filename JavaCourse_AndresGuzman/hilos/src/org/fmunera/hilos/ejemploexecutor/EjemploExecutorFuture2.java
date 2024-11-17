package org.fmunera.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+executor.getQueue().size());
        Callable<String> tarea = () -> {

            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread: "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");

            return "Algún resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Iniciando tarea 3...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);
        
        System.out.println("Tamaño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main");

        //System.out.println(resultado.isDone());

        while(!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.printf("Resultado 1: %s - Resultado 2: %s - Resultado 3: %s",
                    resultado.isDone()? "finalizó":"en proceso",
                    resultado2.isDone()? "finalizó":"en proceso",
                    resultado3.isDone()? "finalizó":"en proceso\n");

            TimeUnit.MILLISECONDS.sleep(500);
        }
        System.out.println("Obtenemos resultado1 de la tarea: "+resultado.get(5, TimeUnit.SECONDS).toUpperCase());
        System.out.println("Finaliza la tarea 1: "+resultado.isDone());

        System.out.println("Obtenemos resultado2 de la tarea: "+resultado2.get(5, TimeUnit.SECONDS).toUpperCase());
        System.out.println("Finaliza la tarea 2: "+resultado2.isDone());

        System.out.println("Obtenemos resultado3 de la tarea (integer): "+resultado3.get(5, TimeUnit.SECONDS));
        System.out.println("Finaliza la tarea 3: "+resultado3.isDone());

        System.out.println("\nTamaño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+executor.getQueue().size());
    }
}