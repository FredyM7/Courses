public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo["+i+"] = " + arreglo[i]);
        }


        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a")+"\n"); /*Lo que hará este método es convertir ese String
        en un arreglo, donde cada elemento de ese arreglo van a ser las palabras o caracteres que están separados por la 'a'*/
        /*Lo que hace es dividir el String según un patron, y esa división después se convierte y se lleva a elementos de un arreglo*/

        /*for (int i=0; i<trabalenguas.split("a").length; i++) {
            System.out.println("trabalenguas.split(\"a\")[] = " + trabalenguas.split("a")[i]);
        }*/

        String[] arreglo2 = trabalenguas.split("a"); //El método genera un arreglo tipo String, ya que los elementos que da pueden tener más de un carácter.
        int largo2 = arreglo2.length;

        for (int i = 0; i < largo2; i++) {
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna_imagen.jpeg";
        String[] archivoarray = archivo.split("\\."); //Expresiones regulares [.] \\.
        int largo3 = archivoarray.length;
        System.out.println("\nlargo3 = " + largo3);
        
        for (int i=0; i<largo3; i++) {
            System.out.println(archivoarray[i]);
        }

        System.out.println("Extensión = " + archivoarray[largo3 - 1]);








    }
}
