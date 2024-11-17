public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        //Encontrar cuantas veces está un carácter en un String
        String frase = "tres tistres tigres tragan trigo en un trigal";
        char letra = 't';
        int maxFrase = frase.length();
        int cantidadCaracter = 0;

        for(int i = 0; i<maxFrase; i++) {

            if(frase.charAt(i) != letra) {
                continue;
            }
            cantidadCaracter++;
        }

        System.out.println("Encontrado "+cantidadCaracter+" veces el carácter ["+letra+"] en la frase");

        /***********************************************************************/
        //Encontrar cuantas veces está una palabra en un String

        String frase2 = "tres tistres tigres tragan trigotrtrigoigo en un trigal de trig0trigo trigo   trigotr";;
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int maxFrase2 = frase2.length() - maxPalabra; //optimización VIDEO {64} CURSO
        int cantidadPalabra = 0;

        buclePrincipal: for(int i = 0; i<=maxFrase2; ) {

            int k = i;

            for (int j = 0; j<maxPalabra; j++) {
                if(frase2.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buclePrincipal;
                }
            }

            cantidadPalabra++;
            i = i + maxPalabra;
        }

        System.out.println("Encontrada "+cantidadPalabra+" veces la palabra ["+palabra+"] en la frase");

    }
}
