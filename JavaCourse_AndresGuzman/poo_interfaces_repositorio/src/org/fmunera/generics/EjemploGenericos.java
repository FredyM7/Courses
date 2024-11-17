package org.fmunera.generics;

import org.fmunera.poointerfaces.modelo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> lista = new ArrayList<>();

        lista.add(new Cliente("Fredy", "Munera"));

        Cliente objeto = lista.get(0);

        Cliente[] clientesArray = {new Cliente("Fredy", "Munera"),
                                   new Cliente("Jose", "Hernandez")};

        Integer[] numbersArray = {1,2,3};

        List<Cliente> clientesList = fromArrayToList(clientesArray);
        List<Integer> numbersList = fromArrayToList(numbersArray);


        clientesList.forEach(System.out::println);
        numbersList.forEach(System.out::println);

        fromArrayToList(clientesArray, clientesArray);

        List<String> nombres = fromArrayToList(new String[]{"Andres","Fredy","Jose"}, numbersArray);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Alvaro","Ortiz")});


        imprimirClientes(lista);
        imprimirClientes(clientesList);
        imprimirClientes(clientesPremiumList);

        System.out.println("El máximo entre 1, 7 y 10 es: "+ maximo(1,7,10));
        System.out.println("El máximo entre 11.3, 14.5 y 27.9 es: "+maximo(11.3, 14.5, 27.9));
        System.out.println("El máximo entre 'manzana', 'arándanos' y 'zanahoria' es: "+maximo("manzana", "arándanos", "zanahoria"));

    }

    public static <T> List<T> fromArrayToList(T[] array){

        return Arrays.asList(array);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] array){

        return Arrays.asList(array);
    }

    public static <T extends Cliente > List<T> fromArrayToList(T[] array){

        return Arrays.asList(array);
    }

    public static <T, G> List<T> fromArrayToList(T[] array, G[] x){

        for(G element: x){
            System.out.println(element);
        }

        return Arrays.asList(array);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){

        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){

        T max = a;

        if(b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }
}
