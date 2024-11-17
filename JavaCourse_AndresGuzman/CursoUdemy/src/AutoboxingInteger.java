public class AutoboxingInteger {
    public static void main(String[] args) {

        //Ejemplo de autoboxing, destacando la forma explícita solo en un número
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma = 0;

        for (Integer i: enteros) {
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }

        System.out.println("suma = " + suma);
        suma = 0;

        //Otra forma: dejandolo implícito, donde se aplica el [AUTO UNBOXING], de wrapper a primitivo para poder realizar operaciones aritméticas.
        for (Integer i: enteros) {
            if (i % 2 == 0) {
                suma += i; //Cuando hay operaciones aritméticas con un objeto (en este caso Integer), se hace un [AUTO UNBOXNG], es decir, se convierte de forma automática en su forma primitiva por debajo, con [i.intValue()]
            }
        }

        System.out.println("suma = " + suma);


    }
}
