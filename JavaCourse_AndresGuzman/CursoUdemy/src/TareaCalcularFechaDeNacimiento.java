import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularFechaDeNacimiento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese su fecha de nacimiento en formato 'yyyy-MM-dd': ");
        String fechaStr = sc.next();

        try {
            Date fecha1 = formato.parse(fechaStr);
            Date fecha2 = new Date();

            long diferenciaEnMillis = fecha2.getTime() - fecha1.getTime(); //El método getTime devuelve la cantidad de milisegundos transcurridos desde la época Unix (1 de enero de 1970 a las 00:00:00 UTC).

            // Convertir la diferencia de milisegundos a años
            long edadEnAnios = diferenciaEnMillis / (1000L * 60 * 60 * 24 * 365); //Esa constante es el número de milisegundos aprox que tiene un año normal.

            // Mostrar la edad calculada
            System.out.println("Su edad es: " + edadEnAnios + " años");

        } catch (ParseException e) {
            System.out.println("ERROR, ingresa una fecha correcta!");
            throw new RuntimeException(e);
        }

    }
}
