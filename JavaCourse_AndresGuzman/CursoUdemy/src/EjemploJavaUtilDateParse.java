import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("\nIngrese una fecha con el formato 'yyyy-MM-dd': ");
        try {
            Date fecha1 = format.parse(sc.next());
            System.out.println("fecha1 = " + fecha1);
            System.out.println("format.format(fecha1) = " + format.format(fecha1));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            //Forma de comparar fechas
            /*if(fecha1.after(fecha2)) {
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            } else if (fecha1.before(fecha2)){
                System.out.println("fecha1 (del usuario) es anterior que fecha2 (actual)");
            } else if (fecha1.equals(fecha2)) {
                System.out.println("fecha1 (del usuario) es igual a fecha2 (actual)");
            }*/

            //Forma de comparar fechas
            if(fecha1.compareTo(fecha2) > 0) {
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            } else if (fecha1.compareTo(fecha2) < 0){
                System.out.println("fecha1 (del usuario) es anterior que fecha2 (actual)");
            } else if (fecha1.compareTo(fecha2) == 0) {
                System.out.println("fecha1 (del usuario) es igual a fecha2 (actual)");
            }

        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("La fecha tiene un formato incorrecto: "+ e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            System.exit(1);
            //main(args);
        }

    }
}
