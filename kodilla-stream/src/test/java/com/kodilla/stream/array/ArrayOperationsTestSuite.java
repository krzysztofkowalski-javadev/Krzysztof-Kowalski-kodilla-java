package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
       //Given
        int[] numbers={20,0,20,0,20,0,20,0,20,0,20,0,20,0,20,0,20,0,20,0};

       //When

double averageOfTable= ArrayOperations.getAverage(numbers);
       //Then

assertEquals(10,averageOfTable);
    }
}
