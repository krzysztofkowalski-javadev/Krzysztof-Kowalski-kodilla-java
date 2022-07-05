package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("Kolo1",1);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(new Triangle("Trojkat2",2));
        shapeCollector.addFigure(new Square("Kwadrat3",3));
        //When
        String firstFigureName =circle1.getShapeName();
        //Then
        Assertions.assertEquals(3,shapeCollector.figuresQuantity());
        Assertions.assertEquals("Kolo1",firstFigureName);

    }
    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("Kolo1",1);
        shapeCollector.addFigure(circle1);

        //When
        boolean result = shapeCollector.removeFigure(circle1);
        //Then
        Assertions.assertTrue(result);

    }
    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("Kolo1",1);
        Triangle triangle1 = new Triangle("Trojkat2",2);

        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(new Square("Kwadrat3",3));

        //When
        String result = shapeCollector.getFigure(1);
        //Then
        Assertions.assertEquals("Trojkat2",result);
    }
    @Test
    void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle1 = new Circle("Kolo1",1);
        Triangle triangle1 = new Triangle("Trojkat2",2);

        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(new Square("Kwadrat3",3));

        //When
        String result = shapeCollector.showFigures();
        //Then
        Assertions.assertEquals("Kolo1Trojkat2Kwadrat3",result);
    }
}
