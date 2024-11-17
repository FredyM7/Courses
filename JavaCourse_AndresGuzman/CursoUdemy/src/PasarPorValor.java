public class PasarPorValor {
    public static void main(String[] args) {


        int i = 10;

        System.out.println("iniciamos el método main con i (se mantiene igual) = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = " + i);

        //¿Qué pasaría sin cambiamos el tipo de dato primitivo por uno de referencia, en el método main y en el parámetro del método test? Pués, pasaría lo mismo que ahora, se mantendría igual en el main sin importar si hiciste un cambio en el método, esto porque todas estas clases WRAPPER que representan a los primitivos son [IMMUTABLES], por lo tanto cada vez que se modifique el valor(en este caso en el método test) del INTEGER, se retornará una nueva instancia, no mantiene la instancia anterior.
        //Los WRAPPER Son OBJETOS ESPECIALES de Java, que no se modifica la instancia original.
        //Si usaramos otro tipo de clase, por ejemplo, una clase propia nuestra, esta no sería immutable y el cambio se efectuaría en ambos métodos, dado el caso.
    }

    public static void test(int i) {

        System.out.println("Iniciamos el método test con i = "+ i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
