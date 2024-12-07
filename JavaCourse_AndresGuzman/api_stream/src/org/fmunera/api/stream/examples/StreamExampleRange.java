package org.fmunera.api.stream.examples;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamExampleRange {
    public static void main(String[] args) {

        IntStream numbers = IntStream.range(5, 20)
                .peek(System.out::println);

        //int result = numbers.reduce(0, Integer::sum);
        //int result = numbers.sum();
        IntSummaryStatistics stats = numbers.summaryStatistics();

        System.out.println("max = "+stats.getMax());
        System.out.println("min = "+stats.getMin());
        System.out.println("sum = "+stats.getSum());
        System.out.println("average = "+stats.getAverage());
        System.out.println("count = "+stats.getCount());

    }
}
