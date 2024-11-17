import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {


        Calendar calendario = Calendar.getInstance();

        //calendario.set(1970, Calendar.SEPTEMBER, 27, 18, 20, 10);//tambien puedes usar constantes como en el caso Calendar.SEPTEMBER que devuelve un valor entero.
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.JANUARY); //se puede usar Calendar.JANUARY(esto en el caso del mes), o simplemente la constante 0,(0 = enero, 11=diciembre) (los meses empiezan por 0 y terminan en 11)
        calendario.set(Calendar.DAY_OF_MONTH, 27);
        //calendario.set(Calendar.HOUR_OF_DAY, 3);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 45);
        calendario.set(Calendar.SECOND, 37);
        calendario.set(Calendar.MILLISECOND, 721);

        Date fecha = calendario.getTime();
        System.out.println("calendario = " + calendario);
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:m:ss:SSS z a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);


    }
}
