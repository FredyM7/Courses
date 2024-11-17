package org.fmunera.poosobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static float sumar(float x, float y){
        return x + y;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float sumar(float j, int i){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        int resultado;

        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }

        return resultado;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumar(int... argumentos){
        int total = 0;

        for (int num : argumentos) {
            total += num;
        }

        return total;
    }

    public static float sumar(float a, int... argumentos){
        float total = a;

        for (int num : argumentos) {
            total += num;
        }

        return total;
    }

    public static double sumar(double... varargs) {
        double total = 0.0;

        for (double num : varargs) {
            total += num;
        }

        return total;
    }
}
