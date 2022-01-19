package main;

public enum Directions {
    NORTH, EAST, SOUTH, WEST;

    @Override
    public String toString() {
        return switch (this) {
            case NORTH -> "N";
            case EAST -> "E";
            case SOUTH -> "S";
            case WEST -> "W";
        };
    }
}
