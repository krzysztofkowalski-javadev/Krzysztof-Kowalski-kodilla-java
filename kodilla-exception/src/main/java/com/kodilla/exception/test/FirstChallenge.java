package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Oh no! Something went wrong! Error:" + e);
            } finally {
                System.out.println("Don't divide by 0");
            }

        }
        return a / b;

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 1);
        System.out.println(result);

    }
}
