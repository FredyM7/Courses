import java.util.Arrays;

public class EjemploMatricesIdentidad {
    public static void main(String[] args) {


        int[][] matrix = new int[5][5];

        for(int i=0; i< matrix.length; i++){
            for(int j=i; j<= i; j++){
                matrix[i][j] = 1;
            }
        }

        for(int[] x : matrix) {
            for(int y : x) {
                System.out.print(y +"   ");
            }
            System.out.println();
        }
    }
}
