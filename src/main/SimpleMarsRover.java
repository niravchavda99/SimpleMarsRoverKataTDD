package main;

public class SimpleMarsRover implements Rover {
    private static final int PLATEAU_GRID_X = 10;
    private static final int PLATEAU_GRID_Y = 10;

    private final Position currentPosition;
    private final Direction currentDirection;

    public SimpleMarsRover() {
        this.currentPosition = new Position(0, 0);
        this.currentDirection = new Direction();
    }

    @Override
    public String execute(String command) throws InvalidCommandException {
        for (int characterPointer = 0; characterPointer < command.length(); characterPointer++) {
            char currentCommand = command.charAt(characterPointer);

            if (currentCommand == 'M') moveRover();
            else if (currentCommand == 'L') this.currentDirection.rotateLeft();
            else if (currentCommand == 'R') this.currentDirection.rotateRight();
            else throw new InvalidCommandException(String.format("Invalid Command: '%c'", currentCommand));
        }

        return String.format("%s:%s", this.currentPosition, this.currentDirection);
    }

    private void moveRover() {
        switch (this.currentDirection.currentFacingDirection) {
            case NORTH -> {
                this.currentPosition.yCoordinate++;
                this.currentPosition.yCoordinate %= PLATEAU_GRID_Y;
            }
            case EAST -> {
                this.currentPosition.xCoordinate++;
                this.currentPosition.xCoordinate %= PLATEAU_GRID_X;
            }
            case SOUTH -> {
                this.currentPosition.yCoordinate--;
                if (this.currentPosition.yCoordinate < 0) this.currentPosition.yCoordinate = PLATEAU_GRID_Y - 1;
            }
            case WEST -> {
                this.currentPosition.xCoordinate--;
                if (this.currentPosition.xCoordinate < 0) this.currentPosition.xCoordinate = PLATEAU_GRID_X - 1;
            }
        }
    }
}
