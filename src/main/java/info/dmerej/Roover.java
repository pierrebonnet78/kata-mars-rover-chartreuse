package info.dmerej;

public class Roover {

    private Coordinates coordinates;
    
    public Roover(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    void movingForward() {
        coordinates.setY(coordinates.getY() + 1);
    }
}
