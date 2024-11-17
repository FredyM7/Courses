package org.fmunera.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {


        Map<String, Object> persona = new HashMap<>();

        System.out.println("Contiene elementos: "+!persona.isEmpty());

        persona.put(null,"1234");
        persona.put(null,"12345"); //no se pueden repetir llaves (se toma el ultimo con la misma llave(null,"12345"))
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

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad"); //Con .get en caso de que la key no existe devuelve null
        String barrio = direccionPersona.getOrDefault("barrio", "(No existe)"); //A diferencia de .get el .getOrDefault si la key no existe devuelve el valor dado en el segundo argumento.

        System.out.println("El país de "+nombre+ "es "+ pais);
        System.out.println("La ciudad de "+nombre+ "es "+ ciudad);
        System.out.println("El barrio de "+nombre+ "es "+ barrio);

        //String valorApellidoPaterno = persona.remove("apellidoPaterno");
        boolean b = persona.remove("apellidoPaterno", "Doe");
        System.out.println("eliminado: "+ b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("Doe");
        System.out.println("b2 = " + b2);

        System.out.println("======================= values");
        Collection<Object> values = persona.values();
        for(Object value: values){
            System.out.println("v = "+value);
        }

        System.out.println("======================= keySet");
        Set<String> keys = persona.keySet();
        for(String key: keys){
            System.out.println("k = "+key);
        }

        System.out.println("======================= entrySet");
        for(Map.Entry<String, Object> par: persona.entrySet()){

            Object value = par.getValue();

            if(value instanceof Map){

                Map<String, String> direccionMap = (Map<String, String>) value;
                for(Map.Entry<String, String> parDir: direccionMap.entrySet()){

                    System.out.println("(Clave: "+parDir.getKey() +" => Valor: "+parDir.getValue()+")");
                }

            } else System.out.println("(Clave: "+par.getKey() +" => Valor: "+value+")");
        }

        System.out.println("======================= keySet");
        for(String key: persona.keySet()){
            Object value = persona.get(key);

            if(value instanceof Map){
                Map<String, String> direccionMap = (Map<String, String>) value;

                System.out.println("País de "+nombre+": "+direccionMap.get("pais"));
                System.out.println("Estado de "+nombre+": "+direccionMap.get("estado"));
                System.out.println("Ciudad de "+nombre+": "+direccionMap.get("ciudad"));

            } else System.out.println("(Clave: "+key +" => Valor: "+value+")");
        }

        System.out.println("======================= java 8 forEach");
        persona.forEach((llave, valor) -> System.out.println("(Clave: "+llave +" => Valor: "+valor+")"));

        System.out.println("total: "+persona.size());
        System.out.println("Contiene elementos: "+!persona.isEmpty());
        //persona.replace("nombre", "Fredy");
        b2 = persona.replace("nombre", "John","Fredy"); //reemplaza con el newValue solo si oldValue existe ya en el map.
        System.out.println("persona = " + persona);
        System.out.println("b2 = " + b2);

    }
}
