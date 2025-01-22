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

    public void translateX(int x) {
        this.x = x+1;
    }

    public void translate(int x, int y, Direction direction) {
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
    }
}
