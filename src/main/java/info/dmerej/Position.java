package info.dmerej;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void translate(int x, int y, Direction direction, Command command) {
        switch (command) {
            case FORWARD:
                switch (direction) {
                    case NORTH:
                        this.y = y+1;
                        break;
                    case SOUTH:
                        this.y = y-1;
                        break;
                    case EAST:
                        this.x = x+1;
                        break;
                    case WEST:
                        this.x = x-1;
                        break;
                }
                break;
            case BACKWARD:
                switch (direction) {
                    case NORTH:
                        this.y = y-1;
                        break;
                    case SOUTH:
                        this.y = y+1;
                        break;
                    case EAST:
                        this.x = x-1;
                        break;
                    case WEST:
                        this.x = x+1;
                        break;
                }
        }
    }
}
