package org.fmunera.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        String numerador = JOptionPane.showInputDialog("Ingresa un entero numerador");
        String denominador = JOptionPane.showInputDialog("Ingresa un entero denominador");
        
        double division2;

        try {
            division2 = cal.dividir(numerador, denominador);
            System.out.println(division2);

        } catch (DivisionPorZeroException ae) {
            System.out.println("captura de excepcion en tiempo de ejecucion: " + ae.getMessage());
            main(args);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detectó una excepción: ingrese un número entero: "+ e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("este finally es opcional, pero se ejecuta siempre con excepcion o sin!");
        }

        System.out.println("continua flujo de app");
    }
}
