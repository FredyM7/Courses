package org.fmunera.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {


        Map<String, Object> persona = new TreeMap<>((a,b) -> b.compareTo(a)); //recomendado: new TreeMap<>(Comparator.reverseOrder());

        //persona.put(null,"1234"); //En TreeMap no deben existir keys null ya que deben ser ordenables.
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","Doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad","30");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);


    }
}
