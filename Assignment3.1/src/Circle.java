public class Circle extends Shape {

    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle with radius " + radius
                + " and color " + color;
    }
}