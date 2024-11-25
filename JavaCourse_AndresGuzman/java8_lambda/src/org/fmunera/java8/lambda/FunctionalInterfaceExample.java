package org.fmunera.java8.lambda;

import org.fmunera.java8.lambda.arithmetic.Arithmetic;
import org.fmunera.java8.lambda.arithmetic.Calculator;

import java.util.function.BiFunction;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {


        Arithmetic sum = Double::sum;
        Arithmetic subtract = (a,b) -> a-b;

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(10, 20, sum));
        System.out.println(calculator.calculate(10, 20, subtract));
        System.out.println(calculator.calculate(10, 20, (a,b) -> a*b));

        BiFunction<Double, Double, Double> sum2 = Double::sum; //Reference method with static method. [Double.sum(a, b)]

        System.out.println(calculator.calculateWithBiFunction(20, 50, sum2));

    }
}
