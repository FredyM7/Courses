import java.util.Arrays;

public class EjemploArreglosFor_2 {
    public static void main(String[] args) {

        String products[] = new String[7]; //El corchete puede ir en el tipo de dato o en el nombre de la variable. Recomendación: declarar con el corchete en el tipo de dato.
        products[0] = "Kingston Pendrive 6460";
        products[1] = "Samsung Galaxy";
        products[2] = "Disco Duro SSD Samsung Externo";
        products[3] = "Asus Notebook"; //Si no se asigna queda como null en casos de tipos de datos de referencia(en este caso String), cuando es int, short, byte, long como [0], cuando es float o double como [0.0] por defecto y cuando es char y no se inicializa quedan con el carácter [null].
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4ta generación";
        products[6] = "Bicicleta Oxford";

        Arrays.sort(products); // Clase de ayuda de java para manipular arrays.

        System.out.println("=======USANDO FOR=========");
        int productsSize = products.length;
        for(int i=0; i< productsSize; i++) {
            System.out.println("products["+i+"] = " + products[i]);
        }

        System.out.println("=======USANDO FOR EACH=========");
        for(String pr: products){
            System.out.println("product = " + pr);
        }

        System.out.println("=======USANDO WHILE=========");
        int i=0;
        while(i<productsSize) {
            System.out.println("products["+i+"] = " + products[i]);
            i++;
        }

        System.out.println("=======USANDO DO WHILE=========");
        int j=0;
        do {
            System.out.println("products["+j+"] = " + products[j]);
            j++;
        } while(j<productsSize);
        System.out.println();

        int[] numbers = new int[10];

        int numbersSize = numbers.length;
        for(int k=0; k< numbersSize; k++) {
            numbers[k] = k*3;
            System.out.println("numbers["+k+"] = " + numbers[k]);

        }

    }
}
