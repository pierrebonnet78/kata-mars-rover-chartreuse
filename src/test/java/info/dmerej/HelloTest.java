package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloTest {

    @Test
    void movingForward() {
        Position position = new Position(4, 2);
        Roover roover = new Roover(position);

        roover.movingForward();

        assertEquals(4, position.getX());
        assertEquals(3, position.getY());
    }

    
}
