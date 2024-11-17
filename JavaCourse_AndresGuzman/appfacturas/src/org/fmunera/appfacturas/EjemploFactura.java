package org.fmunera.appfacturas;

import org.fmunera.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Fredy");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la descripción de la factura: ");

        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for(int i=0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingresa el nombre del producto n° "+producto.getCodigo()+": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Precio del producto: ");
            producto.setPrecio(sc.nextDouble());

            System.out.print("Cantidad: ");

            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));
            System.out.println();
            sc.nextLine();
        }

        System.out.println(factura.generarDetalle());



    }
}
