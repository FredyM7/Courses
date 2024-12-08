package org.fmunera.optional.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        String name = "Fredy";
        Optional<String> opt = Optional.of(name);

        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());

        if(opt.isPresent()) System.out.println("Hola "+opt.get());

        System.out.println(opt.isEmpty());

        opt.ifPresent(value -> System.out.println("Hola "+ value));

        name = null;
        opt = Optional.ofNullable(name);

        System.out.println("opt = "+opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresent(value -> System.out.println("Hola "+ value));

        opt.ifPresentOrElse(value -> System.out.println("Hola "+ value),
                () -> System.out.println("No está presente"));

        if(opt.isPresent()) {
            System.out.println("Hola "+opt.get());
        } else {
            System.out.println("No está presente");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());

    }
}
