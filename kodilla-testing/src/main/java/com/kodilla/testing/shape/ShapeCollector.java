package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
    figures.add(shape);
    }

    public int figuresQuantity() {
        return figures.size();
    }

    public Boolean removeFigure (Shape shape) {
    boolean result =false;
    if (figures.contains(shape)){
        figures.remove(shape);
        result=true;
    }
    return result;
    }

    public String getFigure(int n)   {

    return figures.get(n).getShapeName();
    }

    public String showFigures()   {
        String result="";
    for (int n=0; n<figures.size() ;n++) {
        result+=figures.get(n).getShapeName();
    }
    return result;
    }

}



