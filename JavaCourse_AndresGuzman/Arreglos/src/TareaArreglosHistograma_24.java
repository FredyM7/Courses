/* Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.

El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.

Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

1: ***
2:
3: *
4: *****
5: *
6: **
Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.*/
import java.util.Scanner;

public class TareaArreglosHistograma_24 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] a = new int[12];
        int input;

        System.out.println("Llenar arreglo de enteros en rango [1-6]: ");
        for (int i = 0; i<a.length; i++) {

            do {
                System.out.print("==> [1-6]("+i+"): ");
                input = sc.nextInt();

            } while (input < 1 || input > 6);

            a[i] = input;
        }

        int[] histograma = new int[6];

        for (int n : a){
            histograma[n-1]++;
        }

        System.out.println("Histograma:");

        for (int i = 0; i < histograma.length; i++) {
            int numero = i + 1;
            System.out.print(numero + ": ");

            for (int j = 0; j < histograma[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
