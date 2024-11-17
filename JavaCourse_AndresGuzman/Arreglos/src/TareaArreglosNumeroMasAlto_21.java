/* Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo. */

import java.text.ParseException;
import java.util.Scanner;

public class TareaArreglosNumeroMasAlto_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[7];
        int input;

        System.out.println("Llenar arreglo de enteros en rango [11-99]: ");
        for (int i = 0; i<a.length; i++) {

            do {
                System.out.print("==> [11-99]("+i+"): ");
                input = sc.nextInt();

            } while (input < 11 || input > 99);

            a[i] = input;
        }

        int biggerNum = a[0];
        for (int i = 1; i<a.length; i++){
            biggerNum = Math.max(a[i], biggerNum);
        }

        System.out.println("\nEl número mayor del array es: ["+biggerNum+"]");


    }
}
