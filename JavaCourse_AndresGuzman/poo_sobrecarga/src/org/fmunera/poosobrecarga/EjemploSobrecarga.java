package org.fmunera.poosobrecarga;

import static org.fmunera.poosobrecarga.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int : "+ sumar(10, 5));
        System.out.println("sumar float : "+ sumar(10.0F, 5F));
        System.out.println("sumar float-int : "+ sumar(10f, 5));
        System.out.println("sumar int-float : "+ sumar(10, 5.0F));

        System.out.println("sumar double : "+ sumar(10.0, 5.0));

        System.out.println("sumar String : "+ sumar("10", "5"));

        System.out.println("sumar tres int : "+ sumar(10, 5, 3));
        System.out.println("sumar n ints (con varargs) : "+ sumar(1, 2, 3, 4, 5, 6, 7));
        System.out.println("sumar un float, + n ints (con varargs) : "+ sumar(10.5F, 1, 2, 3, 4, 5, 6, 7));
        System.out.println("sumar n doubles (con varargs) : "+ sumar(10.5, 20.6, 30.5, 40.7));

        System.out.println("sumar long : "+ sumar(10L, 5L)); //Busca el tipo de dato compatible(implementado) más cercano//Conversion automática, los long se van a sumar con la sobrecarga de los flotantes (en este caso).
        System.out.println("sumar int : "+ sumar(10, '@')); //El carácter '@' representa al número 64 en la tabla unicode
        System.out.println("sumar float-int : "+ sumar(10F, '@'));




    }
}
