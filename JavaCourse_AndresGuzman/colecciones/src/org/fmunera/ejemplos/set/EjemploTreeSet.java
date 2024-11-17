package org.fmunera.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {


        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("cinco");
        ts.add("cuatro");
        ts.add("tres");
        ts.add("tres"); //No admite duplicados.
        ts.add("dos");
        ts.add("uno");

        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder()); //forma recomendada.
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println("numeros = " + numeros);

    }
}
