import javax.lang.model.SourceVersion;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Fredy";

        System.out.println("nombre = " + nombre);
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Fredy\") = " + nombre.equals("Fredy"));
        System.out.println("nombre.equals(\"fredy\") = " + nombre.equals("fredy"));
        System.out.println("nombre.equalsIgnoreCase(\"fredy\") = " + nombre.equalsIgnoreCase("fredy"));
        System.out.println("nombre.compareTo(\"Fredy\") = " + nombre.compareTo("Fredy"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); //El 'hasta' no es inclusivo se imprime el [Hasta-1]
        System.out.println("nombre.substring(2,5) = " + nombre.substring(2,5));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\") = " + trabalenguas.replace("a","#"));
        System.out.println("trabalenguas = " + trabalenguas); //No se modifica la información de la instancia principal, son inmutables los Strings
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //Encuentra la primera ocurrencia del argumento [el método es para buscar si una letra o palabra se encuentra en el String que invoca el método](retorna un int)
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //(string o char)Encentra la última ocurrencia del argumento pasado.
        System.out.println("trabalenguas.indexOf(\"x\") = " + trabalenguas.indexOf("x")); //Si no encuentra ninguna coincidencia, da [-1]int
        System.out.println("trabalenguas.contains(\"tr\") = " + trabalenguas.contains("tr")); //Siempre va a ser un String como argumento, retorna booleano
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); //true con "trabalenguas" "trabalengua" "trabalengu" "trabaleng" ...
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("trabalenguas")); //true con "trabalenguas" "rabalenguas" "abalenguas" "balenguas" ...
        System.out.println(" trabalenguas "); //sin .trim
        System.out.println(" trabalenguas ".trim()); //Método .trim quita espacios en blanco al comienzo y al final del texto.









    }
}
