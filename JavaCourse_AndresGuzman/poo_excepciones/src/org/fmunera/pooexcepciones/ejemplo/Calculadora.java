package org.fmunera.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorZeroException{
        if (divisor == 0){
            throw new DivisionPorZeroException("no se puede dividir por cero!");
        }

        return numerador/(double)divisor;

    }

    public double dividir(String numerador, String divisor)
            throws DivisionPorZeroException, FormatoNumeroException {

        try{
            int a = Integer.parseInt(numerador);
            int b = Integer.parseInt(divisor);
            return this.dividir(a,b);
        } catch (NumberFormatException e){
            throw new FormatoNumeroException("debe ingresar un <<número>> en el numerador y divisor");
        }




    }
}
