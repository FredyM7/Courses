package org.fmunera.patterns.abstractfactory.products;

import org.fmunera.patterns.abstractfactory.PizzaProduct;

public class NewYorkItalianPizza extends PizzaProduct {

    public NewYorkItalianPizza() {
        super();
        name = "pizza italiana New York";
        dough = "masa gruesa";
        sauce = "salsa de tomate italiano carne";
        ingredients.add("Queso Mozzarella");
        ingredients.add("Aceitunas");
        ingredients.add("Jamón");
        ingredients.add("Choricillo");
        ingredients.add("Champiñones");
    }

    @Override
    public void cook() {
        System.out.println("Cocinando por 30 min. a 120°C ...");
    }

    @Override
    public void cut() {
        System.out.println("Cortando la pizza en triángulos grandes ...");
    }
}
