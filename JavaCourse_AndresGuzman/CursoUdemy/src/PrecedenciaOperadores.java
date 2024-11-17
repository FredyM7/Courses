public class PrecedenciaOperadores {
    public static void main(String[] args) {


        int i = 14;
        int j = 8;
        int k = 20;

        double promedio;

        double promedioFake = i+j+k/3d; //Tendrá prioridad la div y luego las sumas//al añadir 'd' al 3 en la división, tenemos más precisión[decimales].
        System.out.println("promedioFake = " + promedioFake);
        
        double promedio4Sin_d = (i+j+k)/4; //si queremos precisión double, se coloca la 'd' al lado del 4(en este caso), sino se interpreta ese num como un int, y no será exacto el promedio.
        System.out.println("promedio, 4 sin identificador 'd' = " + promedio4Sin_d);

        double promedio4Con_d = (i+j+k)/4d; //para identificar el num como double
        System.out.println("promedio, 4 con identificador 'd' = " + promedio4Con_d);

        promedio = i + j + k /3d * 10; // 14 + 8 + 66.6
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / (3d * 10);
        System.out.println("promedio = " + promedio);

        //---------**********----------**********---------*********

        promedio = ++i + j-- + k / 3d * 10; // (15+8) + 66.6 //En esta instrucción se tomara j como 8, debido al post decremento, disminuirá solo en la siguiente instrucción.
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j post decrementado = " + j); //En esta otra instrucción, j ya vadrá 7, debido al post decremento.


        

    }
}
