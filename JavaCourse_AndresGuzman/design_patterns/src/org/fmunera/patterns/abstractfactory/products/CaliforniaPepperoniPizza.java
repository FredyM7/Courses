package org.fmunera.patterns.abstractfactory.products;

import org.fmunera.patterns.abstractfactory.PizzaProduct;

public class CaliforniaPepperoniPizza extends PizzaProduct {

    public CaliforniaPepperoniPizza() {
        super();
        name = "pizza pepperoni California";
        dough = "masa a la piedra gruesa";
        ingredients.add("Pepperoni");
        ingredients.add("Extra queso mozzarella");
        ingredients.add("Aceitunas");
    }

    @Override
    public void cook() {
        System.out.println("Cocinando por 50 min. a 55°C ...");
    }

    @Override
    public void cut() {
        System.out.println("Cortando la pizza en pequeños rectángulos");
    }
}
