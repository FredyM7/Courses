package org.fmunera.patterns.abstractfactory.example;


import org.fmunera.patterns.abstractfactory.PizzaProduct;
import org.fmunera.patterns.abstractfactory.PizzeriaAreaAbstractFactory;
import org.fmunera.patterns.abstractfactory.PizzeriaCaliforniaFactory;
import org.fmunera.patterns.abstractfactory.PizzeriaNewYorkFactory;

public class FactoryExample {
    public static void main(String[] args) {


        PizzeriaAreaAbstractFactory newyork = new PizzeriaNewYorkFactory();
        PizzeriaAreaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProduct pizza = california.orderPizza("queso");
        System.out.println("Bruce ordena la pizza: "+pizza.getName());

        pizza = newyork.orderPizza("pepperoni");
        System.out.println("Andres ordena la pizza: "+pizza.getName());

        pizza = california.orderPizza("vegetariana");
        System.out.println("James ordena la pizza: "+pizza.getName());

        pizza = newyork.orderPizza("vegetariana");
        System.out.println("Linus ordena la pizza: "+pizza.getName());

        pizza = california.orderPizza("pepperoni");
        System.out.println("John ordena la pizza: "+pizza.getName());

        System.out.println(pizza);



    }
}
