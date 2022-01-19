package main;

public class Position {
    int xCoordinate;
    int yCoordinate;

    public Position(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return String.format("%d:%d", this.xCoordinate, this.yCoordinate);
    }
}