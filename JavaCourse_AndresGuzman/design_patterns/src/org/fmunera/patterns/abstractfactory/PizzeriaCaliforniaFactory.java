package org.fmunera.patterns.abstractfactory;

import org.fmunera.patterns.abstractfactory.products.CaliforniaVegetarianPizza;
import org.fmunera.patterns.abstractfactory.products.CaliforniaCheesePizza;
import org.fmunera.patterns.abstractfactory.products.CaliforniaPepperoniPizza;

public class PizzeriaCaliforniaFactory extends PizzeriaAreaAbstractFactory{
    @Override
    PizzaProduct createPizza(String type) {
        return switch (type){
            case "queso" -> new CaliforniaCheesePizza();
            case "pepperoni" -> new CaliforniaPepperoniPizza();
            case "vegetariana" -> new CaliforniaVegetarianPizza();
            default -> null;
        };
    }
}
