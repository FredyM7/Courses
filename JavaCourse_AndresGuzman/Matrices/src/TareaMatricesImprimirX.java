import java.util.Scanner;

public class TareaMatricesImprimirX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar un entero 'n' (siendo n>0) para una matriz tamaño (n*n): ");
        int n = sc.nextInt();

        if (n <=0) {
            System.out.println("\nERROR");
            System.exit(1);
        }

        String[][] matrix = new String[n][n];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                if(j==i || j==matrix.length-1-i){
                    matrix[i][j] = "X";
                } else {
                    matrix[i][j] = "_";
                }
            }
        }

        for(String[] x : matrix){
            for(String y : x){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
