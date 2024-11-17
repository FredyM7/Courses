public class ConversionDeTipos {
    public static void main(String[] args) {

        String numString = "50";
        int numInt = Integer.parseInt(numString);
        System.out.println("numInt = " + numInt);

        String realString = "4521.12e-3";
        double realDouble = Double.parseDouble(realString);
        System.out.println("realDouble = " + realDouble);

        String logicoString = "tRuE"; /*Cualquier valor de cadena que sea distinto de true (ignorando mayus minus), ya sea false o cualquier otro,
        el resultado de la conversión a boolean será false.*/
        boolean logicoBoolean = Boolean.parseBoolean(logicoString);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int numInt2 = 100;
        System.out.println("numInt2 = " + numInt2);

        String numString2 = Integer.toString(numInt2);
        System.out.println("numString2 = " + numString2);

        numString2 = String.valueOf(numString2+10); //Al recibir un String y se usa el operador suma, se concatena el String y el número y luego se convierte todo a String.
        System.out.println("numString2 = " + numString2);

        double numDouble = 10.25e2;
        String doubleString = Double.toString(numDouble+10); //Al recibir un double y usamos el operador suma, se suman los números y luego se convierte a String.
        System.out.println("doubleString = " + doubleString);
        
        doubleString = String.valueOf(10.25e2+10);
        System.out.println("doubleString = " + doubleString);


        //Conversiones del mismo tipo, en este caso numéricos (incluyendo char, ya que cada carácter se asocia con un número[entero]), utilizando cast
        int i = 15000;
        double d = 1005.241;

        short s = (short)d;
        System.out.println("s = " + s);

        char b = (char)d;
        System.out.println("b = " + b);

        float f = (float)i;
        System.out.println("f = " + f);

    }
}
