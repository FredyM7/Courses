import java.util.Scanner;

public class TareaDetalleDeFactura {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        String nombreFactura;
        Double precioProducto1 = 0d, precioProducto2 = 0d, impuesto, montoTotalBruto, montoTotalNeto;

        System.out.print("Ingresar nombre de la factura: ");
        nombreFactura = ac.nextLine();

        try {
            System.out.print("Ingresar el valor del producto [1]: ");
            precioProducto1 = ac.nextDouble();
            System.out.print("Ingresar el valor del producto [2]: ");
            precioProducto2 = ac.nextDouble();
        } catch (Exception e) {
            System.out.println("\n¡Parece que ha ocurrido un error! [Repite el proceso]");
            main(args);
            System.exit(0);
        }

        impuesto = (precioProducto1+precioProducto2)*(19/100d);
        montoTotalBruto = (precioProducto1+precioProducto2);
        montoTotalNeto = (montoTotalBruto)+(impuesto);

        System.out.print("La factura ["+nombreFactura.toUpperCase()+"] tiene un total bruto de $"+montoTotalBruto+", con un impuesto de $"+impuesto+" y el monto después de impuesto es de $"+montoTotalNeto);

    }
}
