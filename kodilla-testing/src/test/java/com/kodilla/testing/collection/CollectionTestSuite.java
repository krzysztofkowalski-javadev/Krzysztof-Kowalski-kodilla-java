package com.kodilla.testing.collection;



import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName("Create theList with even numbers" )

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> theList = new ArrayList<Integer>();
        OddNumbersExterminator tester= new OddNumbersExterminator();
        List <Integer>  expectedResult = new ArrayList<Integer>();

        //When
        theList.add(7);
        theList.add(5);
        theList.add(4);
        theList.add(2);
        theList.add(1);

        List <Integer> result= tester.exterminate(theList);
        expectedResult.add(4);
        expectedResult.add(2);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    @DisplayName("Test empty list" )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> theList = new ArrayList<Integer>();
        OddNumbersExterminator tester= new OddNumbersExterminator();
        List <Integer>  expectedResult = new ArrayList<Integer>();

        //When
        List <Integer> result= tester.exterminate(theList);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }


}
