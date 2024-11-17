package org.fmunera.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        Set<String> noDuplicados = new HashSet<>();

        for(String pez: peces){

            if(!noDuplicados.add(pez)){
                System.out.println("Elemento duplicado: "+pez);
            }
        }

        System.out.println(noDuplicados.size()+" elementos no duplicados: "+noDuplicados);
    }
}
