public class Triangle extends Shape {

    double base;
    double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public String toString() {
        return "Triangle with base " + base
                + " and height " + height
                + " and color " + color;
    }
}
