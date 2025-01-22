package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RooverTest {

    @ParameterizedTest
    @CsvSource({
        "NORTH, 4, 2, 4, 3",
        "SOUTH, 4, 2, 4, 1",
        "EAST, 4, 2, 5, 2",
        "WEST, 4, 2, 3, 2"
    })
    void movingForward(Direction direction, int initialX, int initialY, int expectedX, int expectedY) {
        Position position = new Position(initialX, initialY);
        Roover roover = new Roover(position, direction);

        roover.movesForward();

        assertEquals(expectedX, position.getX());
        assertEquals(expectedY, position.getY());
    }

    @ParameterizedTest
    @CsvSource({
        "NORTH, 4, 2, 4, 1",
        "SOUTH, 4, 2, 4, 3",
        "EAST, 4, 2, 3, 2",
        "WEST, 4, 2, 5, 2"
    })
    void movingBackward(Direction direction, int initialX, int initialY, int expectedX, int expectedY) {
        Position position = new Position(initialX, initialY);
        Roover roover = new Roover(position, direction);

        roover.movesBackward();

        assertEquals(expectedX, position.getX());
        assertEquals(expectedY, position.getY());
    }

     @ParameterizedTest
    @CsvSource({
        "NORTH, WEST",
        "SOUTH, EAST",
        "EAST, NORTH",
        "WEST, SOUTH"
    })
    void movingLeft(Direction direction, Direction expectedDirection) {
        Position position = new Position(4, 2);
        Roover roover = new Roover(position, direction);

        roover.movesLeft();

        assertEquals(expectedDirection, roover.getDirection());
    }

    @ParameterizedTest
    @CsvSource({
        "NORTH, EAST",
        "SOUTH, WEST",
        "EAST, SOUTH",
        "WEST, NORTH"
    })
    void movingRight(Direction direction, Direction expectedDirection) {
        Position position = new Position(4, 2);
        Roover roover = new Roover(position, direction);

        roover.movesRight();

        assertEquals(expectedDirection, roover.getDirection());
    }
}
