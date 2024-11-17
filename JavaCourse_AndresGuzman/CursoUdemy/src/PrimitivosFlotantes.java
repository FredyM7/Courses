public class PrimitivosFlotantes {
    public static void main(String[] args) {

        float realFloat = 3.4028235E38F;
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.0f; /*Al colocar 'F' después del # se indica que es un Float, si no se coloca se detectará como un Double
        y este no se puede convertir automáticamente a Float, por ende dará error (esto en caso de utilizar el punto ej. 1.0)*/
        System.out.println("realFloat2 = " + realFloat2);
        
        float realFloat3 = 2.12e3f; //2120f Conversión a notación científica
        System.out.println("realFloat3 = " + realFloat3);

        float realFloat4 = 0.00000000015f; //equivale a 1.5e-10f  [Mantisa o parte fraccionaria -->(1.5)] [(e-10f) = (10^-10)]
        // ej: [(2.12e3f) = (2.12*10^3) = 2120 <-- Valor en punto fijo]
        System.out.println("realFloat4 = " + realFloat4 + "\n");

        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("valor máximo del tipo float = " + Float.MAX_VALUE);
        System.out.println("valor mínimo del tipo float = " + Float.MIN_VALUE + "\n");

        double realDouble = 1.7976931348623157E308; /*Se podría colocar una 'd' o 'D' al final del número para indicar que es un tipo doble,
        pero no es necesario en este caso, ya que al poner el punto a un real en la literal se definirá por defecto como double, lo que no pasa con el tipo FLOAT.*/
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("valor máximo del tipo double = " + Double.MAX_VALUE);
        System.out.println("valor mínimo del tipo double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416; /*Al tener punto el número en la parte literal, se define automáticamente como Double.
        Si se quiere definir como tipo Float, se debe especificar con la letra 'f' o 'F' al final del valor.
        Si el número en la literal no tiene punto, se definirá como int, siempre y cuando no supere el límite de este tipo de entero,
        de lo contrario se deberá especificar 'L'[tipo long] o 'F'[tipo float] o 'D'[tipo double] según lo que se requiera*/


    }
}
