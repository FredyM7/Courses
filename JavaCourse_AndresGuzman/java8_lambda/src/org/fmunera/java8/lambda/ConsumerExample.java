package org.fmunera.java8.lambda;

import org.fmunera.java8.lambda.models.User;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {


        Consumer<Date> print = fecha -> {

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(format.format(fecha));
        };

        print.accept(new Date());


        BiConsumer<String, Integer> consumerBi = (name, age) -> System.out.println(name +" is "+age+" years old");
        consumerBi.accept("Fredy", 20);

        Consumer<String> message = System.out::println;//Using method reference (when parameter = argument).

        List<String> names = Arrays.asList("fredy","andres","pedro","maria","rodrigo");
        names.forEach(System.out::println);


        User user = new User();
        BiConsumer<User, String> nameAssigner = User::setName; //Reference method with two arguments.

        nameAssigner.accept(user, "Fredy");
        System.out.println("user name: " + user.getName());

        Supplier<String> supplier = () -> "Hello world! lambda supplier";
        System.out.println(supplier.get());
    }
}
