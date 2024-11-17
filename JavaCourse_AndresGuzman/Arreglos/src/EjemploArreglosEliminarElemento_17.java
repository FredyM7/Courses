import java.util.Scanner;

public class EjemploArreglosEliminarElemento_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Llenar arreglo de enteros: ");
        for(int i = 0; i<a.length; i++){
            System.out.print("("+i+"): ");
            a[i] = sc.nextInt();
        }

        System.out.print("Posición del número que desea eliminar: ");
        int aEliminar = sc.nextInt();

        for (int i = aEliminar; i<a.length-1; i++){
            a[i] = a[i+1];
        }

        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length);

        a = b;
        System.out.println("Sin el elemento en la Pos dada: ");
        for (int n : a){
            System.out.print("["+n + "] ");
        }

    }
}
