public class SentenciaForEach {
    public static void main(String[] args) {


        int[] numeros  = {1,3,5,7,9,11,13,15};

        for(int num: numeros) { //parte desde el primer elemento del arreglo, asignando cada uno a la variable local num, y se utiliza en el bloque del bucle, según lo que se quiera hacer[en este caso imprimirlos].
            System.out.println("num = " + num);
        }
        System.out.println();

        String[] nombres = {"Andres",
                "Pepe",
                "Maria",
                "Paco",
                "Lalo",
                "Bea",
                "Pato",
                "Pepa"};

        for(String names: nombres) {
            System.out.println("names = " + names);
        }
    }
}
