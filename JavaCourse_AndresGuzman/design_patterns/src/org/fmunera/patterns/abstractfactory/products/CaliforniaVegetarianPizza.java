package org.fmunera.patterns.abstractfactory.products;

import org.fmunera.patterns.abstractfactory.PizzaProduct;

public class CaliforniaVegetarianPizza extends PizzaProduct {


    public CaliforniaVegetarianPizza() {
        super();
        name = "pizza vegetariana California";
        dough = "masa delgada light";
        sauce = "salsa BBQ light";
        ingredients.add("Queso mozzarella");
        ingredients.add("Aceitunas");
        ingredients.add("Espinacas");
        ingredients.add("Cebolla");
        ingredients.add("Berenjena");
    }

    @Override
    public void cook() {
        System.out.println("Cocinando por 20 min. a 180°C ...");
    }

    @Override
    public void cut() {
        System.out.println("Cortando la pizza en rebanadas rectangulares...");
    }
}
