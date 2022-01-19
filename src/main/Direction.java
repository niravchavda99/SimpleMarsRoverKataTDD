package main;

import java.util.List;

public class Direction {
    private static final List<Directions> allDirections = List.of(Directions.values());
    Directions currentFacingDirection = Directions.NORTH;

    public void rotateLeft() {
        int indexOfCurrentFacingDirection = indexOfCurrentFacingDirection();
        int indexOfRotatedDirection = indexOfCurrentFacingDirection - 1;
        if (indexOfRotatedDirection < 0) indexOfRotatedDirection = 3;
        currentFacingDirection = allDirections.get(indexOfRotatedDirection);
    }

    public void rotateRight() {
        int indexOfCurrentFacingDirection = indexOfCurrentFacingDirection();
        int indexOfRotatedDirection = (indexOfCurrentFacingDirection + 1) % 4;
        currentFacingDirection = allDirections.get(indexOfRotatedDirection);
    }

    private int indexOfCurrentFacingDirection() {
        return allDirections.indexOf(currentFacingDirection);
    }

    @Override
    public String toString() {
        return currentFacingDirection.toString();
    }
}
