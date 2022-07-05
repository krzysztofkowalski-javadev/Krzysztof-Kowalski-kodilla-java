package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String getShapeName;
    private double getField;

    public Circle(String getShapeName, double getField) {
        this.getShapeName = getShapeName;
        this.getField = getField;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "getShapeName='" + getShapeName + '\'' +
                ", getField=" + getField +
                '}';
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

        Circle circle = (Circle) o;

        if (Double.compare(circle.getField, getField) != 0) return false;
        return getShapeName.equals(circle.getShapeName);
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
