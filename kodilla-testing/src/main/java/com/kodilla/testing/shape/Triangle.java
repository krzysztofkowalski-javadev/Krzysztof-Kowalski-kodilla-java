package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String getShapeName;
    private double getField;

    public Triangle(String getShapeName, double getField) {
        this.getShapeName = getShapeName;
        this.getField = getField;
    }

    @Override
    public String getShapeName() {
        return getShapeName;

    }

    @Override
    public double getField() {
        return getField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.getField, getField) != 0) return false;
        return getShapeName.equals(triangle.getShapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName.hashCode();
        temp = Double.doubleToLongBits(getField);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
