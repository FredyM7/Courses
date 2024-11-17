import java.util.Scanner;

public class EjemploArreglosDetectarOrden_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("[Ingrese (10) números enteros]");
        for (int i=0; i<array.length; i++) {
            System.out.print("("+i+"): ");
            array[i] = sc.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i=0; i< array.length-1; i++) {
            if (array[i] < array[i+1]){
                ascendente = true;
            }
            if (array[i] > array[i+1]){
                descendente = true;
            }
        }

        if (ascendente && descendente){
            System.out.println("[ORDEN : DESORDENADO]");
        }
        if (!ascendente && !descendente){
            System.out.println("[ORDEN : TODOS IGUALES]");
        }
        if (ascendente && !descendente){
            System.out.println("[ORDEN : ASCENDENTE]");
        }
        if (!ascendente && descendente){
            System.out.println("[ORDEN : DESCENDENTE]");
        }
    }
}
