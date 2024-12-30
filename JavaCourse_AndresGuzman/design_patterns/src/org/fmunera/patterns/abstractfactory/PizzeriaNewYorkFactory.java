package org.fmunera.patterns.abstractfactory;

import org.fmunera.patterns.abstractfactory.products.NewYorkItalianPizza;
import org.fmunera.patterns.abstractfactory.products.NewYorkPepperoniPizza;
import org.fmunera.patterns.abstractfactory.products.NewYorkVegetarianPizza;

public class PizzeriaNewYorkFactory extends PizzeriaAreaAbstractFactory {


    @Override
    PizzaProduct createPizza(String type) {

        return switch (type) {
            case "vegetariana" -> new NewYorkVegetarianPizza();
            case "pepperoni" -> new NewYorkPepperoniPizza();
            case "italiana" -> new NewYorkItalianPizza();
            default -> null;
        };
    }
}
