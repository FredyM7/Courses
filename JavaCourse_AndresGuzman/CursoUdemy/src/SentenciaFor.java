public class SentenciaFor {
    public static void main(String[] args) {

        int i = 0;
        for( ; ; ) { //puedes modificar cada bloque del for [definir indice afuera, configurar el bloque de condición como un if-break dentro del bloque de cod del bucle,aumentar indice al final del bloque de cod] (funcionará exactamente igual)

            if (i > 5) {
                break;
            }

            System.out.println("i = " + i);

            i++;
        }
        System.out.println();

        for(int j = 0; j<=10; j++) {
            System.out.println("j = " + j);
        }
        System.out.println();

        for (int k = 10; k >= 0; k--) {
            System.out.println("k = " + k);
        }
        System.out.println();

        //Podríamos tener más de una variable de inicio en un for.
        //Podemos compararlas, incrementarlas, decrementarlas o hacer combinaciones. Ej:
        for(int m = 1, n = 10 ; m < n; m++, n--){
            System.out.println(m + " - "+ n);
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                continue; /*[comando para salirse de una iteración (no del for)]
                En este caso cuando se cumpla lo del if se ejecutará ese bloque,
                ejecutando el comando continue, que saltará esa iteración en cuestión,
                luego sigue el bucle normalmente*/
            }
            //Cada vez que el número sea par, se saldrá de la iteración y no se imprimirá.
            System.out.println("j = " + j);
        }


    }
}
