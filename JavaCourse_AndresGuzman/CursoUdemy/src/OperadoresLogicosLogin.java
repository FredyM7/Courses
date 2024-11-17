import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "fredy";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "1234";

        usernames[2] = "pepe";
        passwords[2] = "123";*/


        //FORMA SIMPLIFICADA DE ESCRIBIR LOS ARREGLOS (Usando llaves);

        String[] usernames = {"fredy", "admin", "pepe"};
        String[] passwords = {"12345", "1234", "123"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar username: ");
        String u = sc.nextLine();

        System.out.print("Ingresar password: ");
        String p = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {

             /*if( (usernames[i].equals(u) && passwords[i].equals(p)) ) {
                 esAutenticado = true;
                 break;
             }*/

                esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
        }

        /*if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }*/

        String mensaje = (esAutenticado) ? "Bienvenido usuario ".concat(u).concat("!") :
        "Username o contraseña incorrecto!\nLo siento, requiere autenticación";

        System.out.println(mensaje);


    }
}

