import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("[Arreglo inicial]");
        for (int i = 0; i<array.length; i++){
            array[i] = i+1;
            System.out.print("["+array[i]+"] ");
        }

        int last = array[array.length-1];
        for (int i = array.length-1; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = last;

        System.out.println("\n[Con posición adelantada]");
        for (int j : array) {
            System.out.print("[" + j + "] ");
        }
    }
}
