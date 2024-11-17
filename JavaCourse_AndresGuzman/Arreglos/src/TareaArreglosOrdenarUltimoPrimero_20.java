
/* Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
el segundo, el antepenúltimo, el tercero, y así sucesivamente.*/
import java.util.Scanner;

public class TareaArreglosOrdenarUltimoPrimero_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Llenar arreglo de enteros: ");
        for(int i = 0; i<a.length; i++) {
            System.out.print("("+i+"): ");
            a[i] = sc.nextInt();
        }

        System.out.println("\n[ORDEN]");
        for(int i = 0; i<a.length/2; i++) {
            System.out.println(a[a.length-1-i]+" :: "+a[i]);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("La posición " + i + " corresponde al número: " + a[i]);
        }
    }
}
