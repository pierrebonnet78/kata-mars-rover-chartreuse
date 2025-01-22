package info.dmerej;

public class Roover {

    private Position position;
    
    public Roover(Position position) {
        this.position = position;
    }

    void movingForward() {
        position.translateY(this.position.getY());
    }

}
