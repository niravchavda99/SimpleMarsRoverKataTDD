package main;

public interface Rover {
    String execute(String command) throws InvalidCommandException;
}