package org.fmunera.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado", "Corvina"};

        Set<String> noDuplicados = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for(String pez: peces){

            if(!noDuplicados.add(pez)){
                duplicados.add(pez);
            }
        }

        noDuplicados.removeAll(duplicados);

        System.out.println("No duplicados: "+noDuplicados);
        System.out.println("Duplicados: "+duplicados);
    }
}
