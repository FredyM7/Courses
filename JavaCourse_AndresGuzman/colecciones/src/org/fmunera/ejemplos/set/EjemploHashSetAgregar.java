package org.fmunera.ejemplos.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));//.add devuelve un boolean, para saber si se agregó exitosamente o no el elemento (true or false)
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs);
        List<String> lista = new ArrayList<>(hs);
        boolean b = hs.add("tres"); //Este string no lo agrega al Set, ya que ya existe, no admite duplicados (Devuelve false).
        System.out.println(hs);
        System.out.println("Admite elementos duplicados?: "+b);
    }
}
