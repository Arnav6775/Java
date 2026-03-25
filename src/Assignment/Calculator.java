package Assignment;

// Q9: Calculator class with method overloading (compile-time polymorphism)

public class Calculator {

    // add() with two integers
    public int add(int a, int b) {
        System.out.println("Calling add(int, int)");
        return a + b;
    }

    // add() with three integers
    public int add(int a, int b, int c) {
        System.out.println("Calling add(int, int, int)");
        return a + b + c;
    }

    // add() with two doubles
    public double add(double a, double b) {
        System.out.println("Calling add(double, double)");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        System.out.println("Result: " + sum1);
        System.out.println();

        int sum2 = calc.add(10, 20, 30);
        System.out.println("Result: " + sum2);
        System.out.println();

        double sum3 = calc.add(5.5, 3.7);
        System.out.println("Result: " + sum3);
    }
}
