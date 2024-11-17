import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];
        int num, posicion, ultimo;

        System.out.println("Llenar array de forma ordenada: ");
        for (int i = 0; i< array.length; i++){
            System.out.print("("+i+"): ");
            array[i] = sc.nextInt();
        }

        System.out.print("\nNúmero entero a insertar en el arreglo ordenado: ");
        num = sc.nextInt();

        posicion = 0;
        while(posicion < array.length-1 && num > array[posicion]) {

            posicion++;
        }

        ultimo = array[array.length-1];
        //Desplazar posiciones
        for(int i = array.length-1; i>posicion; i--) {
            array[i] = array[i-1];
        }

        int[] b = new int[array.length+1];
        System.arraycopy(array, 0, b, 0, array.length);

        array = b;

        if (num > ultimo) {
            array[array.length-1] = num;
        } else {
            array[posicion] = num;
            array[array.length-1] = ultimo;
        }

        System.out.println("\n[Arreglo con nuevo número y ordenado]");
        for (int n : array){
            System.out.print("["+ n + "] ");
        }

    }
}
