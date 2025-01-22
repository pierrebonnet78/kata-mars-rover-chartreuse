package info.dmerej;

public class Roover {

    private Position position;
    private Direction direction;
    
    public Roover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    void movingForward() {
        position.translateY(this.position.getY(), this.direction);
    }
    

}
