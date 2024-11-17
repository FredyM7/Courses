import java.util.Arrays;

public class EjemploArreglosForInverso_3 {
    public static void main(String[] args) {

        //String products[] = new String[7]; //El corchete puede ir en el tipo de dato o en el nombre de la variable. Recomendación: declarar con el corchete en el tipo de dato.

        String[] products = {"Kingston Pendrive 6460", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación",
                "Bicicleta Oxford"};

        /*products[0] = "Kingston Pendrive 6460";
        products[1] = "Samsung Galaxy";
        products[2] = "Disco Duro SSD Samsung Externo";
        products[3] = "Asus Notebook"; //Si no se asigna queda como null en casos de tipos de datos de referencia(en este caso String), cuando es int, short, byte, long como [0], cuando es float o double como [0.0] por defecto y cuando es char y no se inicializa quedan con el carácter [null].
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4ta generación";
        products[6] = "Bicicleta Oxford";
*/
        Arrays.sort(products); // Clase de ayuda de java para manipular arrays.

        System.out.println("=======USANDO FOR=========");
        int productsSize = products.length;
        for(int i=0; i< productsSize; i++) {
            System.out.println("products["+i+"] = " + products[i]);
        }
        System.out.println();

        //Iterando de forma inversa (del ultimo al primero).
        System.out.println("=======USANDO FOR INVERSO=========");
        for(int i=0; i<productsSize; i++) {
            System.out.println("products["+(productsSize-1-i)+"] = " + products[productsSize-1-i]);
        }

        System.out.println("=======USANDO FOR INVERSO 2=========");
        for(int i = productsSize-1; i>=0; i--) {
            System.out.println("products["+i+"] = " + products[i]);
        }



    }
}
