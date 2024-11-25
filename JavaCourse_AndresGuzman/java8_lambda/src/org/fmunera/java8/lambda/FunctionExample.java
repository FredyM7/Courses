package org.fmunera.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        //Function: Transforma un valor de tipo T en uno de tipo R.
        Function<String, String> f1 = parameter -> "Hi, how u doing! "+parameter;

        String result = f1.apply("Fredy");
        System.out.println(result);

        Function<String, String> f2 = String::toUpperCase; //Referencia a método.
        System.out.println(f2.apply("fredy"));

        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(" ").concat(b.toUpperCase());
        System.out.println(f3.apply("fredy", "munera"));

        BiFunction<String, String, Integer> f4 = String::compareTo; //(a,b) -> a.compareTo(b);
        System.out.println(f4.apply("daniel", "daniel"));

        BiFunction<String, String, String> f5 = String::concat; //(a,b) -> a.concat(b);
        System.out.println(f5.apply("daniel", "felipe"));

    }
}
