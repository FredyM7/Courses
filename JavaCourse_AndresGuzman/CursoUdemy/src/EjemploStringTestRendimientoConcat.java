public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i= 0; i <100000; i++) {
            c = c.concat(a).concat(b).concat("\n"); // 500 => 3ms, 1000 => 7ms, 10000 => 223ms, 100000 =>7837ms
            //c += a + b + "\n"; // 500 => 25ms, 1000 => 32m, 10000 => 131ms, 100000 => 2997ms
            //sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 4ms, 100000 => 19ms
    //StringBuilder a diferencia de String, es mutable, por lo que no es necesario definir cada paso por el loop, sino que se modifica solo.
        }

        System.gc(); //Para invocar de forma explícita el garbage collector, para liberar espacio(borra todos los objetos que no se están utilizando, o que no se están referenciando en ninguna parte de la aplicacion)

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);

        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

        System.exit(0); //opcional, esto se hace de forma automática

    }
}


