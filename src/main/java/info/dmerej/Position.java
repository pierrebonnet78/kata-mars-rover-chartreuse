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

    public void translateY(int y) {
        this.y = y+1;
    }
}
