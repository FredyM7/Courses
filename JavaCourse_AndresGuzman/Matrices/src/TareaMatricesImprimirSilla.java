import java.util.Scanner;

public class TareaMatricesImprimirSilla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar un entero 'n' (siendo n>0) para una matriz tamaño (n*n): ");
        int n = sc.nextInt();

        if (n <=0) {
            System.out.println("\nERROR");
            System.exit(1);
        }

        int[][] matrix = new int[n][n];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                if(j==0 || i==(n/2) || (j==n-1 && i>(n/2))){
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        /*for(int[] x : matrix){
            for(int y : x){
                System.out.print(y);
            }
            System.out.println();
        }*/
    }
}
