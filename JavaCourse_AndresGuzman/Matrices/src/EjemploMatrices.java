public class EjemploMatrices {
    public static void main(String[] args) {


        int[][] matrix = new int[2][4];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;

        System.out.println("Número de filas de la matriz: "+matrix.length);
        System.out.println("Número de columnas de la matriz: "+matrix[0].length); //Cada fila puede tener un número de columnas diferente.
        System.out.println();
        System.out.println("Primer elemento de la matriz: "+matrix[0][0]);
        System.out.println("Ultimo elemento de la matriz: "+matrix[matrix.length-1][matrix[1].length-1]);
        System.out.println();

        int num1 = matrix[0][0];
        int num2 = matrix[0][1];
        int num3 = matrix[0][2];
        int num4 = matrix[0][3];
        int num5 = matrix[1][0];
        int num6 = matrix[1][1];
        int num7 = matrix[1][2];
        int num8 = matrix[1][3];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);

    }
}
