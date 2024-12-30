package org.fmunera.patterns.decorator.decorators;

import org.fmunera.patterns.decorator.Formatable;

public class ReverseDecorator extends TextDecorator{


    public ReverseDecorator(Formatable formatable) {
        super(formatable);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder(formatable.format());
        return sb.reverse().toString();
    }
}
