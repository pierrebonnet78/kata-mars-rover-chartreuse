package info.dmerej;

public class Roover {

    private Position position;
    private Direction direction;
    
    public Roover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    void movesForward() {
        position.translate(this.position.getX(), this.position.getY(), this.direction);
    }
    

}
