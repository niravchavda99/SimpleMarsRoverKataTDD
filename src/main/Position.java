package main;

public class Position implements Cloneable {
    int xCoordinate;
    int yCoordinate;

    public Position(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) return true;
        if (objectToCompare == null || getClass() != objectToCompare.getClass()) return false;
        Position position = (Position) objectToCompare;
        return xCoordinate == position.xCoordinate && yCoordinate == position.yCoordinate;
    }

    @Override
    public String toString() {
        return String.format("%d:%d", this.xCoordinate, this.yCoordinate);
    }

    @Override
    public Position clone() {
        try {
            Position clonedObject = (Position) super.clone();
            clonedObject.xCoordinate = this.xCoordinate;
            clonedObject.yCoordinate = this.yCoordinate;
            return clonedObject;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}