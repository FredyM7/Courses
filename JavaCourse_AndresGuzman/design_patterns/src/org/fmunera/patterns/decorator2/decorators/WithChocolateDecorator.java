package org.fmunera.patterns.decorator2.decorators;

import org.fmunera.patterns.decorator2.Configurable;

public class WithChocolateDecorator extends CoffeeDecorator {


    public WithChocolateDecorator(Configurable configurable) {
        super(configurable);
    }

    @Override
    public float getBasePrice() {
        return configurable.getBasePrice() + 5f;
    }

    @Override
    public String getIngredients() {
        return configurable.getIngredients() +", Chocolate";
    }
}
