public class EjemploArreglosOrdenPrincipioFinal_6 {
    public static void main(String[] args) {

        int[] array = new int[10];
        int[] array2 = new int[10];

        for(int i = 0; i< array.length; i++) {
            array[i] = i+1;
        }
        for(int i = 0; i< array.length/2; i++) {
            System.out.println(array[i] +" : "+array[(array.length)-1-i]);
        }
        System.out.println();

        int aux = 0;
        for(int i=0; i< array2.length/2; i++){ // (array2.length/2) o (array2.length - i) para iterar solo hasta la mitad del array. [En este caso porque estamos llenando dos elementos al array2 por cada iteración]
            array2[aux++] = array[i];
            array2[aux++] = array[array2.length-1-i];
        }
        for(int i = 0; i< array2.length; i++) {
            System.out.println("i : "+array2[i]);
        }
    }
}
