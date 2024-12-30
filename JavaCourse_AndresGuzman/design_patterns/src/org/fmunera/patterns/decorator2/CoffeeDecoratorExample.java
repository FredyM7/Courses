package org.fmunera.patterns.decorator2;

import org.fmunera.patterns.decorator2.decorators.WithChocolateDecorator;
import org.fmunera.patterns.decorator2.decorators.WithCreamDecorator;
import org.fmunera.patterns.decorator2.decorators.WithMilkDecorator;

public class CoffeeDecoratorExample {
    public static void main(String[] args) {

        Configurable coffee = new Coffee(7,"Cafe Mocha");

        WithCreamDecorator withCream = new WithCreamDecorator(coffee);
        WithMilkDecorator withMilk = new WithMilkDecorator(withCream);
        WithChocolateDecorator withChocolate = new WithChocolateDecorator(withMilk);

        System.out.println("El precio de ("+withChocolate.getIngredients()+") es de: "+withChocolate.getBasePrice());

        Configurable cappuccino = new Coffee(4,"Cafe Capuchino");
        withCream = new WithCreamDecorator(cappuccino);
        withMilk = new WithMilkDecorator(withCream);

        System.out.println("El precio de ("+withMilk.getIngredients()+") es de: "+withMilk.getBasePrice());

        Configurable espresso = new Coffee(3, "Cafe Espresso");

        System.out.println("El precio de ("+espresso.getIngredients()+") es de: "+espresso.getBasePrice());



    }
}
