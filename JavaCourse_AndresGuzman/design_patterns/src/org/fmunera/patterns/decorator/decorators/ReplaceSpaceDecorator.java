package org.fmunera.patterns.decorator.decorators;

import org.fmunera.patterns.decorator.Formatable;

public class ReplaceSpaceDecorator extends TextDecorator {


    public ReplaceSpaceDecorator(Formatable formatable) {
        super(formatable);
    }

    @Override
    public String format() {
        return formatable.format().replace(" ", "_");
    }
}
