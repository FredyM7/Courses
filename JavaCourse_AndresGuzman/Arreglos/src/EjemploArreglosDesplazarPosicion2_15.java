import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2_15 {
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
        int posicion = sc.nextInt()-1;

        for (int i = array.length-1; i>posicion; i--) {
            array[i] = array[i-1];
        }
        array[posicion] = newNum;
 
        System.out.println("\n[Con nuevo número y posiciones adelantadas]");
        for (int j : array) {
            System.out.print("[" + j + "] ");
        }
    }
}
