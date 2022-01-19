package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleMarsRoverTest {

    @Test
    public void roverRotatesFromNorthToEast() {
        Direction direction = new Direction();
        direction.rotateRight();
        assertEquals("E", direction.toString());
    }

    @Test
    public void roverRotatesFromEastToSouth() {
        Direction direction = new Direction();
        direction.rotateRight();
        direction.rotateRight();
        assertEquals("S", direction.toString());
    }

    @Test
    public void roverRotatesFromSouthToWest() {
        Direction direction = new Direction();
        direction.rotateRight();
        direction.rotateRight();
        direction.rotateRight();
        assertEquals("W", direction.toString());
    }

    @Test
    public void roverRotatesFromWestToNorth() {
        Direction direction = new Direction();
        direction.rotateRight();
        direction.rotateRight();
        direction.rotateRight();
        direction.rotateRight();
        assertEquals("N", direction.toString());
    }

    @Test
    public void roverRotatesFromNorthToWest() {
        Direction direction = new Direction();
        direction.rotateLeft();
        assertEquals("W", direction.toString());
    }

    @Test
    public void roverRotatesFromWestToSouth() {
        Direction direction = new Direction();
        direction.rotateLeft();
        direction.rotateLeft();
        assertEquals("S", direction.toString());
    }

    @Test
    public void roverRotatesFromSouthToEast() {
        Direction direction = new Direction();
        direction.rotateLeft();
        direction.rotateLeft();
        direction.rotateLeft();
        assertEquals("E", direction.toString());
    }

    @Test
    public void roverRotatesFromEastToNorth() {
        Direction direction = new Direction();
        direction.rotateLeft();
        direction.rotateLeft();
        direction.rotateLeft();
        direction.rotateLeft();
        assertEquals("N", direction.toString());
    }

    @Test
    public void roverMovesNorth() throws InvalidCommandException {
        Rover rover = new SimpleMarsRover();
        assertEquals("0:1:N", rover.execute("M"));

        rover = new SimpleMarsRover();
        assertEquals("0:2:N", rover.execute("MM"));

        rover = new SimpleMarsRover();
        assertEquals("0:3:N", rover.execute("MMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:4:N", rover.execute("MMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:5:N", rover.execute("MMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:6:N", rover.execute("MMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:7:N", rover.execute("MMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:8:N", rover.execute("MMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:9:N", rover.execute("MMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:0:N", rover.execute("MMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:1:N", rover.execute("MMMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:2:N", rover.execute("MMMMMMMMMMMM"));
    }

    @Test
    public void roverMovesEast() throws InvalidCommandException {
        Rover rover = new SimpleMarsRover();
        assertEquals("1:0:E", rover.execute("RM"));

        rover = new SimpleMarsRover();
        assertEquals("2:0:E", rover.execute("RMM"));

        rover = new SimpleMarsRover();
        assertEquals("3:0:E", rover.execute("RMMM"));

        rover = new SimpleMarsRover();
        assertEquals("4:0:E", rover.execute("RMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("5:0:E", rover.execute("RMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("6:0:E", rover.execute("RMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("7:0:E", rover.execute("RMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("8:0:E", rover.execute("RMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("9:0:E", rover.execute("RMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:0:E", rover.execute("RMMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("1:0:E", rover.execute("RMMMMMMMMMMM"));
    }

    @Test
    public void roverMovesSouth() throws InvalidCommandException {
        Rover rover = new SimpleMarsRover();
        assertEquals("0:9:S", rover.execute("LLM"));

        rover = new SimpleMarsRover();
        assertEquals("0:8:S", rover.execute("LLMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:7:S", rover.execute("LLMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:6:S", rover.execute("LLMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:5:S", rover.execute("LLMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:4:S", rover.execute("LLMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:3:S", rover.execute("LLMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:2:S", rover.execute("LLMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:1:S", rover.execute("LLMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:0:S", rover.execute("LLMMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:9:S", rover.execute("LLMMMMMMMMMMM"));
    }

    @Test
    public void roverMovesWest() throws InvalidCommandException {
        Rover rover = new SimpleMarsRover();
        assertEquals("9:0:W", rover.execute("LM"));

        rover = new SimpleMarsRover();
        assertEquals("8:0:W", rover.execute("LMM"));

        rover = new SimpleMarsRover();
        assertEquals("7:0:W", rover.execute("LMMM"));

        rover = new SimpleMarsRover();
        assertEquals("6:0:W", rover.execute("LMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("5:0:W", rover.execute("LMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("4:0:W", rover.execute("LMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("3:0:W", rover.execute("LMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("2:0:W", rover.execute("LMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("1:0:W", rover.execute("LMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("0:0:W", rover.execute("LMMMMMMMMMM"));

        rover = new SimpleMarsRover();
        assertEquals("9:0:W", rover.execute("LMMMMMMMMMMM"));
    }

    @Test
    public void roverMovesRandomly() throws InvalidCommandException {
        Rover rover = new SimpleMarsRover();
        assertEquals("2:3:N", rover.execute("MMRMMLM"));
    }

    @Test
    public void wrongCommandDoesntExecute() {
        assertThrows(InvalidCommandException.class, () -> new SimpleMarsRover().execute("MMMDM"));
    }
}
