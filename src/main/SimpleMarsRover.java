package main;

public class SimpleMarsRover implements Rover {
    private final Grid plateauGrid;
    private Position currentPosition;
    private Direction currentDirection;

    public SimpleMarsRover() {
        initializePositionAndDirection();
        this.plateauGrid = new Grid(10, 10, null);
    }

    public SimpleMarsRover(Grid plateauGrid) {
        initializePositionAndDirection();
        this.plateauGrid = plateauGrid;
    }

    private void initializePositionAndDirection() {
        this.currentPosition = new Position(0, 0);
        this.currentDirection = new Direction();
    }

    @Override
    public String execute(String command) throws InvalidCommandException {
        boolean foundObstacle = false;
        for (int characterPointer = 0; characterPointer < command.length() && !foundObstacle; characterPointer++) {
            char currentCommand = command.charAt(characterPointer);

            if (currentCommand == 'M') foundObstacle = moveRoverAndGetObstacleStatus();
            else if (currentCommand == 'L') this.currentDirection.rotateLeft();
            else if (currentCommand == 'R') this.currentDirection.rotateRight();
            else throw new InvalidCommandException(String.format("Invalid Command: '%c'", currentCommand));
        }

        return String.format("%s%s:%s", foundObstacle ? "O:" : "", this.currentPosition, this.currentDirection);
    }

    private boolean hasObstacle(Position givenPosition) {
        return this.plateauGrid.obstacles.contains(givenPosition);
    }

    private boolean moveRoverAndGetObstacleStatus() {
        Position nextPosition = calculateNextPosition();

        if (hasObstacle(nextPosition)) return true;

        this.currentPosition = nextPosition;
        return false;
    }

    private Position calculateNextPosition() {
        Position nextPosition = this.currentPosition.clone();

        switch (this.currentDirection.currentFacingDirection) {
            case NORTH -> {
                nextPosition.yCoordinate++;
                nextPosition.yCoordinate %= this.plateauGrid.columns;
            }
            case EAST -> {
                nextPosition.xCoordinate++;
                nextPosition.xCoordinate %= this.plateauGrid.rows;
            }
            case SOUTH -> {
                nextPosition.yCoordinate--;
                if (nextPosition.yCoordinate < 0)
                    nextPosition.yCoordinate = this.plateauGrid.columns - 1;
            }
            case WEST -> {
                nextPosition.xCoordinate--;
                if (nextPosition.xCoordinate < 0) nextPosition.xCoordinate = this.plateauGrid.rows - 1;
            }
        }

        return nextPosition;
    }
}
