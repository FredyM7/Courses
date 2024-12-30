package org.fmunera.patterns.decorator2.decorators;

import org.fmunera.patterns.decorator2.Configurable;

public class WithMilkDecorator extends CoffeeDecorator {

    public WithMilkDecorator(Configurable configurable) {
        super(configurable);
    }

    @Override
    public float getBasePrice() {
        return configurable.getBasePrice() + 3.7f;
    }

    @Override
    public String getIngredients() {
        return configurable.getIngredients()+ ", Leche";
    }
}
