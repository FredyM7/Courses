public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("valor máximo del tipo byte = " + Byte.MAX_VALUE);
        System.out.println("valor mínimo del tipo byte = " + Byte.MIN_VALUE + "\n");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("valor máximo del tipo short = " + Short.MAX_VALUE);
        System.out.println("valor mínimo del tipo short = " + Short.MIN_VALUE + "\n");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor máximo del tipo int = " + Integer.MAX_VALUE);
        System.out.println("valor mínimo del tipo int = " + Integer.MIN_VALUE + "\n");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("valor máximo del tipo long = " + Long.MAX_VALUE);
        System.out.println("valor mínimo del tipo long = " + Long.MIN_VALUE);

        var numeroVar = 127; //[VARIABLE DINÁMICA] Por defecto se definirá en el caso de un número como Integer, esto hasta que pasemos el límite del entero tipo Int
        var numeroVar2 = 13123156137F;


    }
}
