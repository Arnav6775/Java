package Assignment;

// Q7: Abstract Shape class with Circle and Rectangle subclasses

abstract class Shape {
    // Abstract method - must be implemented by subclasses
    abstract double calculateArea();

    // Concrete method
    void displayInfo() {
        System.out.println("This is a shape. Area = " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends Shape {
    private double length;
    private double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        // Trying to instantiate Shape directly would give compilation error:
        // Shape s = new Shape(); // ERROR: Cannot instantiate abstract class

        Circle c = new Circle(5);
        System.out.println("Circle:");
        System.out.println("  Area = " + String.format("%.2f", c.calculateArea()));
        c.displayInfo();

        System.out.println();

        RectangleShape r = new RectangleShape(4, 6);
        System.out.println("Rectangle:");
        System.out.println("  Area = " + String.format("%.2f", r.calculateArea()));
        r.displayInfo();
    }
}
