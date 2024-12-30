package org.fmunera.patterns.decorator;

import org.fmunera.patterns.decorator.decorators.ReplaceSpaceDecorator;
import org.fmunera.patterns.decorator.decorators.ReverseDecorator;
import org.fmunera.patterns.decorator.decorators.UnderlineDecorator;
import org.fmunera.patterns.decorator.decorators.UppercaseDecorator;

public class DecoratorExample {
    public static void main(String[] args) {

        Formatable text = new Text("Hola que tal Fredy!");

        UppercaseDecorator uppercaseText = new UppercaseDecorator(text);
        ReverseDecorator reverseText = new ReverseDecorator(uppercaseText);
        UnderlineDecorator underlineText = new UnderlineDecorator(reverseText);
        ReplaceSpaceDecorator replaceSpaceText = new ReplaceSpaceDecorator(underlineText);

        System.out.println(replaceSpaceText.format());

        /*System.out.println(
                new UnderlineDecorator(
                    new ReverseDecorator(
                        new UppercaseDecorator(text))).format());*/

    }
}
