package Assignment;

public class Person {

    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge()     { return age; }

    // toString for clean printing
    @Override
    public String toString() {
        return "Person { name='" + name + "', age=" + age + " }";
    }

    // ── Main ──────────────────────────────────────────────────────────────────
    public static void main(String[] args) {

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob",   25);

        System.out.println(p1);
        System.out.println(p2);
    }
}