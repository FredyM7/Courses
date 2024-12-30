package org.fmunera.patterns.abstractfactory.products;

import org.fmunera.patterns.abstractfactory.PizzaProduct;

public class NewYorkPepperoniPizza extends PizzaProduct {

    public NewYorkPepperoniPizza() {
        super();
        name = "pizza pepperoni New York";
        dough = "masa delgada a la piedra";
        sauce = "salsa de tomate";
        ingredients.add("Queso Mozzarella");
        ingredients.add("Extra pepperoni");
        ingredients.add("Aceitunas");
    }

    @Override
    public void cook() {
        System.out.println("Cocinando por 40 min. a 90°C ...");
    }

    @Override
    public void cut() {
        System.out.println("Cortando la pizza en triángulos ...");
    }
}
