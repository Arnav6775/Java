package Assignment;

// Q11: Hierarchical inheritance - Shape → Circle, Rectangle (drawing app)

class DrawingShape {
    public void display() {
        System.out.println("This is a general shape.");
    }
}

class DrawingCircle extends DrawingShape {
    private double radius;

    public DrawingCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("This is a Circle with radius = " + radius);
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("  Area of Circle = " + String.format("%.2f", area));
    }
}

class DrawingRectangle extends DrawingShape {
    private double length;
    private double width;

    public DrawingRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("This is a Rectangle with length = " + length + " and width = " + width);
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("  Area of Rectangle = " + area);
    }
}

public class DrawingApp {
    public static void main(String[] args) {
        System.out.println("=== Drawing Application ===\n");

        DrawingCircle circle = new DrawingCircle(7);
        circle.display();
        circle.calculateArea();

        System.out.println();

        DrawingRectangle rect = new DrawingRectangle(10, 5);
        rect.display();
        rect.calculateArea();
    }
}
