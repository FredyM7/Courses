import java.util.Scanner;

public class TareaArreglosSistemaEstadistico_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[7];
        int cantidadPos = 0;
        int sumaPos = 0;

        int cantidadNeg = 0;
        int sumaNeg = 0;

        int cantidadCeros = 0;

        System.out.println("Llenar arreglo de enteros: ");
        for (int i = 0; i<a.length; i++) {
            System.out.print("("+i+"): ");
            a[i] = sc.nextInt();

            if (a[i] > 0) {
                sumaPos += a[i];
                cantidadPos++;
            } else if (a[i] < 0 ){
                sumaNeg += a[i];
                cantidadNeg++;
            } else {
                cantidadCeros++;
            }
        }

        double promedioPos = (cantidadPos > 0) ? ((double) sumaPos/cantidadPos) : 0;
        double promedioNeg = (cantidadNeg > 0) ? ((double) sumaNeg/cantidadNeg) : 0;

        System.out.println("\nPromedio de números positivos: "+promedioPos);
        System.out.println("Promedio de números negativos: "+promedioNeg);
        System.out.println("Cantidad de ceros: "+cantidadCeros);
    }
}
