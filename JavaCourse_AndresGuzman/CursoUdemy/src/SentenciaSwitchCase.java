import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número del mes [1-12]: ");
        int mes = sc.nextInt();

        String nombreMes = null;

        switch (mes) {

            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }

        System.out.println("Nombre del mes = " + nombreMes);

        System.out.println("\n*******----------**********-----------*******");
        String nombre = "fredy";

        switch (nombre) {

            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "fredy":
                System.out.println("Hola fredy!");
                break;
            case "pepe":
                System.out.println("Hola pepe!");
                break;
            default:
                System.out.println("Usuario desconocido!");


        }
    }
}
