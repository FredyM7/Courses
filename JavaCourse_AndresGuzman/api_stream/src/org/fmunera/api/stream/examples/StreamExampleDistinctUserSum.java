package org.fmunera.api.stream.examples;


import org.fmunera.api.stream.examples.models.User;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExampleDistinctUserSum {
    public static void main(String[] args) {

        IntStream namesLength = Stream.of("fredy Munera","pato Gomez", "pato Gomez", "pato Gomez", "pepa Medina","pepe Noguera", "pepe García")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct()
                .mapToInt(user -> user.toString().length()-1)
                .peek(System.out::println);
        
        //namesLength.forEach(System.out::println);
        //System.out.println("Total = "+namesLength.sum());
        IntSummaryStatistics stats = namesLength.summaryStatistics();
        System.out.println("max = "+stats.getMax());
        System.out.println("min = "+stats.getMin());
        System.out.println("sum = "+stats.getSum());
        System.out.println("average = "+stats.getAverage());


    }
}
