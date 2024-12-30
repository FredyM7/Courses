package org.fmunera.patterns.decorator.decorators;

import org.fmunera.patterns.decorator.Formatable;

public class UppercaseDecorator extends TextDecorator{

    public UppercaseDecorator(Formatable formatable) {
        super(formatable);
    }

    @Override
    public String format() {
        return formatable.format().toUpperCase();
    }
}
