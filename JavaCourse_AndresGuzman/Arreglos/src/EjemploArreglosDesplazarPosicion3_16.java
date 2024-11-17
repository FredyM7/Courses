import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];
        int num, posicion;

        System.out.println("Llenar array de forma ordenada: ");
        for (int i = 0; i< array.length-1; i++){
            System.out.print("("+i+"): ");
            array[i] = sc.nextInt();
        }

        System.out.print("\nNúmero entero a insertar en el arreglo ordenado: ");
        num = sc.nextInt();

        posicion = 0;
        while(posicion < array.length-1 && num > array[posicion]) {

            posicion++;
        }

        //Desplazar posiciones
        for(int i = array.length-1; i>posicion; i--) {
            array[i] = array[i-1];
        }

        array[posicion] = num;

        System.out.println("\n[Arreglo con nuevo número y ordenado]");
        for (int n : array){
            System.out.print("["+ n + "] ");
        }

    }
}
