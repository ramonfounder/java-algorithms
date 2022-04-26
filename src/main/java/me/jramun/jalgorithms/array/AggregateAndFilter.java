package me.jramun.jalgorithms.array;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AggregateAndFilter {


    public static int[] aggregate(int[] a, int[] b) {
        IntPredicate intPredicate = num -> num % 2 == 0;
        return Stream.of(a, b).flatMapToInt(Arrays::stream).filter(intPredicate).toArray();
    }

    public static void main(String[] args) {

    }
}
