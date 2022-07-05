package com.kodilla.stream.array;



import java.util.stream.IntStream;



public interface ArrayOperations {
    static double getAverage(int[] numbers) {
                 IntStream.range(0, numbers.length)
                .map(i->numbers[i])
                .forEach(num -> System.out.println(num));


        double averageOfTable= IntStream.range(0,numbers.length)
                .map(i->numbers[i])
                .average().getAsDouble();

        return averageOfTable;
    }
}
