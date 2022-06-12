package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int resultAddAB = calculator.add(6, 4);
        if (resultAddAB == 10) {
            System.out.println("test calculator add Ok");
        } else {
            System.out.println("Error!");
        }
        int resultSubtractAB=calculator.subtract(8,5);
        if (resultSubtractAB == 3) {
            System.out.println("test calculator subtract Ok");
        } else {
            System.out.println("Error!");
        }
    }
}