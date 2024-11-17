import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable_4 {
    public static void arregloInverso(String[] arreglo){
        String actual = null;
        String inverso = null;
        int productsSize2 = arreglo.length;
        int productsSize = arreglo.length;
        for(int i = 0; i< productsSize2; i++) {
            actual = arreglo[i];
            inverso = arreglo[productsSize-1-i];

            arreglo[i] = inverso;
            arreglo[productsSize-1-i] = actual;
            productsSize2--;

        }
    }
    public static void main(String[] args) {

        String[] products = {"Kingston Pendrive 6460", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación",
                "Bicicleta Oxford"};

        Arrays.sort(products); //Helper// Clase de ayuda de java para manipular arrays.

        arregloInverso(products); //Haciéndolo explícitamente.
        //Collections.reverse(Arrays.asList(products)); //Utilizando la api collections de java, como el argumento recibe un tipo list nos ayudamos en la clase helper Arrays para convertir 'products' del tipo array a tipo list.

        System.out.println("=======USANDO FOR=========");
        int productsSize = products.length;
        for(int i=0; i< productsSize; i++) {
            System.out.println("products["+i+"] = " + products[i]);
        }
        System.out.println();


    }
}
