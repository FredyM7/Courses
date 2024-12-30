package org.fmunera.patterns.abstractfactory.products;

import org.fmunera.patterns.abstractfactory.PizzaProduct;

public class CaliforniaCheesePizza extends PizzaProduct {

    public CaliforniaCheesePizza() {
        super();
        name = "pizza queso california";
        dough = "masa a la piedra delgada";
        sauce = "salsa de tomáte rucula";
        ingredients.add("Extra Queso Mozzarella");
        ingredients.add("Cebolla");
        ingredients.add("Queso azul");
    }

    @Override
    public void cook() {
        System.out.println("Cocinando a 35 min. a 100°C ...");
    }

    @Override
    public void cut() {
        System.out.println("Cortando la pizza en pequeños triángulos ...");
    }
}
