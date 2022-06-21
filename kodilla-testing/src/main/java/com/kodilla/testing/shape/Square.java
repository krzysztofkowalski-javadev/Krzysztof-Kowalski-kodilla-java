package com.kodilla.testing.shape;

public class Square implements Shape{

    private final String getShapeName;
    private final double getField;

    public Square(String getShapeName, double getField) {
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

        Square square = (Square) o;

        if (Double.compare(square.getField, getField) != 0) return false;
        return getShapeName.equals(square.getShapeName);
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
