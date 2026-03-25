package Assignment;

// Q6: Rectangle class with Area method
public class Rectangle {

    private double length;
    private double breadth;

    // Constructor with length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Area() method returns area
    public double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Area of Rectangle 1 (4 x 5) = " + r1.area());
        System.out.println("Area of Rectangle 2 (5 x 8) = " + r2.area());
    }
}
