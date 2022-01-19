package main;

import java.util.Collections;
import java.util.List;

public class Grid {
    public final int rows;
    public final int columns;
    final List<Position> obstacles;

    public Grid(int rows, int columns, List<Position> obstacles) {
        this.rows = rows;
        this.columns = columns;
        this.obstacles = obstacles == null ? Collections.emptyList() : Collections.unmodifiableList(obstacles);
    }
}
