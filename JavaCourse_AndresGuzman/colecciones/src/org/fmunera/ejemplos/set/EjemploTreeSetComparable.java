package org.fmunera.ejemplos.set;

import org.fmunera.ejemplos.modelo.Alumno;

import static java.util.Comparator.comparingInt;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {


        //Set<Alumno> sa = new TreeSet<>((a,b) -> Integer.compare(b.getNota(),a.getNota()));
        Set<Alumno> sa = new TreeSet<>(comparingInt(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));

        System.out.println(sa);

    }
}
