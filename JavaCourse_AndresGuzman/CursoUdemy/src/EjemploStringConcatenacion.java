public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor "+ profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB); /*Las expresiones se van evaluando de izquierda a derecha[precedencia de operadores].
        Si encuentra primero una cadena(string) en la izquierda, asumirá que todo se trata de una cadena, y va a concatenar. */

        System.out.println(detalle + (numeroA + numeroB )); /*Con los paréntesis cambiamos la precedencia.
        Es decir, el orden en que se evalúan las operaciones. En este caso se realizará la suma primero y luego la concatenación.*/

        //Al revés (se realizará primero la suma, luego la concatenación).
        System.out.println(numeroA + numeroB + detalle);

        //Los Strings son inmutables, por lo que cualquier cambio que se realice en un String, utilizando algún método, retorna otro String(otra instancia, otro objeto distinto...)

        String detalle2 = curso.concat(" con el instructor ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

        detalle2 = curso.concat(" con el instructor ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
