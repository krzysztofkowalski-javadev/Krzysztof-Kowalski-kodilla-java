package testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

private String author;


    private List<Shape> figures = new ArrayList<>();

    public void addFigure(String getShapeName, double getField) {
    Circle theCircle1 = new Circle("Circle1",2.1);
    Square theSquare1 = new Square("Square1",3.5);

    figures.add(theCircle1);
    figures.add(theSquare1);
    }

    public Boolean removeFigure (Shape shape) {
//
    return true;
    }

    public String getFigure(int n)   {
//
    return "";
    }

    public String showFigures()   {
//
    return "";
    }

}



