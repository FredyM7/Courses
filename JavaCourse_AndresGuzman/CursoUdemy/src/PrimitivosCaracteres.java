public class PrimitivosCaracteres {
    public static void main(String[] args) {
        
        char caracter = '\u0040'; //Los caracteres en JAVA están basados en el estándar de codificación [UNICODE]
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == caracter: " + (decimal == caracter)); //La comparación retornará una expresión booleana[true o false]

        char simbolo = '@';
        var caracter2 = '\u1204'; /*[VarDinámica] Lo detecta automáticamente como char.
        En este caso no se podría usar el número identificador del símbolo ej. [64], ya que lo detectaría como un entero.*/
        System.out.println("caracter2 = " + caracter2);

        System.out.println("caracter = " + caracter);
        System.out.println("tipo char corresponde en bytes a " + Character.BYTES);
        System.out.println("tipo char corresponde en bits a " + Character.SIZE);
        System.out.println("valor máximo del tipo char = " + Character.MAX_VALUE);
        System.out.println("valor mínimo del tipo char = " + Character.MIN_VALUE + "\n");

        char espacio = ' '; //'\u0020'
        char retroceso = '\b'; //backspace (sirve para borrar, eliminar un carácter)

        System.out.println("\t¡Hello"+espacio+"world!A"+retroceso); /*Borra la letra A con la var retroceso, también se utiliza el espacio definido en la var.
        Los caracteres especiales también se pueden utilizar directamente dentro del string, como es el caso de una tabulación [\t], al inicio del string.*/

        char nuevaLinea = '\n'; //Es un salto de línea
        char retornoCarro = '\r'; //Borra toda una línea hasta el inicio, la reinicia

    }
}
