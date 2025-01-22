package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloTest {

    @Test
    void movingForward() {
        Coordinates coordinates = new Coordinates(4, 2);
        Roover roover = new Roover(coordinates);

        roover.movingForward();

        assertEquals(4, coordinates.getX());
        assertEquals(3, coordinates.getY());

    }
}
