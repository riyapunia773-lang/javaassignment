public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public String toString() {
        return "Rectangle with width " + width
                + " and height " + height
                + " and color " + color;
    }
}