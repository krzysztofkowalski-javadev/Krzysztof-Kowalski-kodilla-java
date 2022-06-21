package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;



public class StreamMain {

    public static void main(String[] args) {

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

/*
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Work",(text)->"ABC"+text+"ABC");
        poemBeautifier.beautify("House",(text)->text.toUpperCase());
        poemBeautifier.beautify("Flowers",(text)->text.toLowerCase());
        poemBeautifier.beautify("Crazy",(text)->text.repeat(3));
*/


        /*
        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5,(a,b)->a+b);
        expressionExecutor.executeExpression(10,5,(a,b)->a-b);
        expressionExecutor.executeExpression(10,5,(a,b)->a*b);
        expressionExecutor.executeExpression(10,5,(a,b)->a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

         */
    }
}
