public class EjemploArreglosForOrdenamientoBurbuja_5 {
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

    public static void bubbleSort(Object[] array){

        int productsSize = array.length;

        int counter = 0;
        for(int i = 0; i < productsSize-1; i++) {

            for (int j = 0; j < productsSize-1-i; j++) {

                if(((Comparable)array[j+1]).compareTo(array[j]) < 0) {
                    Object aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }
    public static void main(String[] args) {

        String[] products = {"Kingston Pendrive 6460", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación",
                "Bicicleta Oxford"};

        bubbleSort(products);

        int productsSize = products.length;
        System.out.println("=======USANDO FOR=========");
        for(int i=0; i< productsSize; i++) {
            System.out.println("products["+i+"] = " + products[i]);
        }
        System.out.println();

        Integer[] numbers = new Integer[4];

        numbers[0] = 10;
        numbers[1] = Integer.valueOf("7");
        numbers[2] = (int) 35L;
        numbers[3] = -1;

        bubbleSort(numbers);

        for(int i=0; i< numbers.length; i++) {
            System.out.println("i = "+i+" : "+ numbers[i]);
        }


    }
}
