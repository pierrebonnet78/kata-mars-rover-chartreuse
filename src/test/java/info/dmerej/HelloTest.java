package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloTest {

    @Test
    void movingForwardFacingNorth() {
        Position position = new Position(4, 2);
        Direction direction = Direction.NORTH;
        Roover roover = new Roover(position, direction);

        roover.movingForward();

        assertEquals(4, position.getX());
        assertEquals(3, position.getY());
    }

    @Test
    void movingForwardFacingSouth() {
        Position position = new Position(4, 2);
        Direction direction = Direction.SOUTH;
        Roover roover = new Roover(position, direction);

        roover.movingForward();

        assertEquals(4, position.getX());
        assertEquals(1, position.getY());
    }
}
