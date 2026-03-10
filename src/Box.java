public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {

        this.length = length;
        this.width = width;
        this.height = height;

    }

    public Box(double side) {
        this(side, side, side);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return this.length * this.width * this.height;
    }

    public Box greaterVolume(Box otherBox) {
        if (this.volume() > otherBox.volume()) {
            return this;
        }
        if (this.volume() < otherBox.volume()) {
            return otherBox;
        }
        return null;
    }

    public String boxInfo() {
        return InfoString.boxInfoString(this);
    }

    public void addToShape(Shape s) {
        s.attachBox(this);
    }

    @Override
    public String toString() {
        return boxInfo();
    }
}