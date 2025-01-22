package info.dmerej;

public class Roover {

    private Position position;
    private Direction direction;
    
    public Roover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }

    void movesForward() {
        position.translate(this.position.getX(), this.position.getY(), this.direction, Command.FORWARD);
    }

    void movesBackward() {
        position.translate(this.position.getX(), this.position.getY(), this.direction, Command.BACKWARD);
    }

    void movesLeft() {
        switch (this.direction) {
            case NORTH:
                this.direction = Direction.WEST;
                break;
            case SOUTH:
                this.direction = Direction.EAST;
                break;
            case EAST:
                this.direction = Direction.NORTH;
                break;
            case WEST:
                this.direction = Direction.SOUTH;
                break;
        }
    }

    void movesRight() {
        switch (this.direction) {
            case NORTH:
                this.direction = Direction.EAST;
                break;
            case SOUTH:
                this.direction = Direction.WEST;
                break;
            case EAST:
                this.direction = Direction.SOUTH;
                break;
            case WEST:
                this.direction = Direction.NORTH;
                break;
        }
    }   
    

}
