public class EjemploClaseMath {
    public static void main(String[] args) {

        //La clase Math es parecida a la clase System, es una clase que no se puede instanciar y son solamente métodos estáticos, es decir, que se invocan con el nombre de la clase, punto, y el nombre del método (Clase.método)(Math.(...))
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(37);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double redondeoTecho = Math.ceil(3.5);
        System.out.println("redondeoTecho = " + redondeoTecho);

        double redondeoPiso = Math.floor(3.5);
        System.out.println("redondeoPiso = " + redondeoPiso);

        long redondeoNormal = Math.round(Math.PI);//Si el número es superior o igual en la forma [.5] toma el techo, si es inferior redondea al piso.(retorna un valor entero)
        System.out.println("redondeoNormal = " + redondeoNormal);

        double exp = Math.exp(1);//La función lo que recibe la función .exp es la potencia de la base predeterminada exp(número E[Euler]).
        System.out.println("exp = " + exp);

        double log = Math.log(1);//Logaritmo natural de...[parámetro]
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);//En el ejemplo del parámetro sería, diez[10] elevado a la potencia tres[3].
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(7);
        double raiz2 = Math.pow(7, (1/2d));
        System.out.println("raiz = " + raiz);
        System.out.println("raiz2 = " + raiz2);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90d);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): "+ Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180d);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0d);
        System.out.println("cos(0): " + Math.cos(radianes));
    }
}
