package org.fmunera.patterns.abstractfactory.products;

import org.fmunera.patterns.abstractfactory.PizzaProduct;

public class NewYorkVegetarianPizza extends PizzaProduct {

    public NewYorkVegetarianPizza() {
        super();
        name = "pizza vegetariana New York";
        dough = "masa integral vegana";
        sauce = "salsa de tomate";
        ingredients.add("Queso vegano");
        ingredients.add("Tomate");
        ingredients.add("Aceitunas");
        ingredients.add("Espinacas");
        ingredients.add("Berenjenas");
    }

    @Override
    public void cook() {
        System.out.println("Cocinando por 25 min. a 150°C ...");
    }

    @Override
    public void cut() {
        System.out.println("Cortando la pizza en rebanadas cuadradas ...");
    }


}
