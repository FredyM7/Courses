package org.fmunera.ejemplos.list;

import org.fmunera.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparingInt;
import java.util.List;


public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        //Collections.sort(sa, (a,b) -> a.getNombre().compareTo(b.getNombre());
        //Collections.sort(sa, Comparator.comparing(Alumno::getNombre);
        //Collections.sort(sa, (a,b) -> Integer.compare(a.getNota(), b.getNota()));
        //sa.sort(Comparator.comparingInt(alumno -> alumno.getNota()));
        sa.sort(comparingInt(Alumno::getNota).reversed());

        System.out.println("\nIterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
