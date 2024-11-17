public class EjemploArreglosCombinados_7 {
    public static void main(String[] args) {

        int[] a,b,c;
        a = new int[9];
        b = new int[9];
        c = new int[18];

        for (int i=0; i<a.length; i++) {
            a[i] = (i+1)*10;
            b[i] = i+1;
        }

        int aux = 0;
        for (int i=0; i<c.length/2; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int j : c) {
            System.out.println("i : " + j);
        }
        System.out.println("#############");

        //Llenar tres del primer arreglo y tres del segundo en el tercer arreglo, así sucesivamente...
        aux = 0;
        for (int i = 0; i < a.length; i+=3) {
            for(int j=0; j<3; j++) {
                c[aux++] = a[i+j];
            }
            for(int j=0; j<3; j++){
                c[aux++] = b[i+j];
            }
        }

        for (int j : c) {
            System.out.println("i : " + j);
        }

        //Para cambiarlo: para llenar elementos de cuatro en cuatro, cinco en cinco, etc, los tamaños de los arreglos
        //deben ser múltiplos de dicho orden para que puedan encajar los elementos.

    }
}
