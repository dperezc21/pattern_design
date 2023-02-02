package patternDesign.prototype;

public class BirdPrototype implements BirdClone {
    private String color = "black";
    private int speed = 10;
    private int positionY = 20;

    public BirdPrototype(BirdPrototype bird) {
        super();
        this.color = bird.color;
        this.speed = bird.speed;
        this.positionY = bird.positionY;
    }

    public BirdPrototype(int speed, int positionY) {
        this.speed = speed;
        this.positionY = positionY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void getBird() {
        System.out.println("color --> "+ this.color + " speed --> " + this.speed );
    }

    @Override
    public BirdClone clone(BirdClone bird) {
        return new BirdPrototype((BirdPrototype) bird);
    }
}
