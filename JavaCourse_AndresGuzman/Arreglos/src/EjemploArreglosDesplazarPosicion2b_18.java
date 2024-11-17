import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("[Arreglo inicial]");
        for (int i = 0; i<array.length; i++){
            array[i] = i+1;
            System.out.print("["+array[i]+"] ");
        }

        System.out.print("\nIngresa un nuevo número entero al array: ");
        int newNum = sc.nextInt();

        System.out.print("Ingresa la posición del nuevo número en el array [1-10]: ");
        int position = sc.nextInt()-1;

        int last = array[array.length-1];
        for (int i = array.length-1; i>position; i--) {
            array[i] = array[i-1];
        }

        int[] b = new int[array.length+1];

        System.arraycopy(array, 0, b, 0, array.length);
        array = b;
        array[position] = newNum;
        array[b.length-1] = last;
 
        System.out.println("\n[Con nuevo número y posiciones adelantadas]");
        for (int j : array) {
            System.out.print("[" + j + "] ");
        }
    }
}
