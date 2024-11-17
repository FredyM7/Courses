public class EjemploMatricesMarco {
    public static void main(String[] args) {


        int[][] matrix = new int[5][5];

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                if(j==0 || j== matrix[i].length-1 || i==0 || i==matrix.length-1){
                    matrix[i][j] = 1;
                }
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
