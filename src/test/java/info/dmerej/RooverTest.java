package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RooverTest {

    @Test
    void movingForwardFacingNorth() {
        Position position = new Position(4, 2);
        Direction direction = Direction.NORTH;
        Roover roover = new Roover(position, direction);

        roover.movesForward();

        assertEquals(4, position.getX());
        assertEquals(3, position.getY());
    }

    @Test
    void movingForwardFacingSouth() {
        Position position = new Position(4, 2);
        Direction direction = Direction.SOUTH;
        Roover roover = new Roover(position, direction);

        roover.movesForward();

        assertEquals(4, position.getX());
        assertEquals(1, position.getY());
    }

    @Test
    void movingForwardFacingEast() {
        Position position = new Position(4, 2);
        Direction direction = Direction.EAST;
        Roover roover = new Roover(position, direction);

        roover.movesForward();

        assertEquals(5, position.getX());
        assertEquals(2, position.getY());
    }

    @Test
    void movingForwardFacingWest() {
        Position position = new Position(4, 2);
        Direction direction = Direction.WEST;
        Roover roover = new Roover(position, direction);

        roover.movesForward();

        assertEquals(3, position.getX());
        assertEquals(2, position.getY());
    }
}
