package ClassAndObject;
class Circle_1 {
    double radius;

    // Default constructor
    Circle_1() {
        this(1.0); // calls parameterized constructor
    }

    // Parameterized constructor
    Circle_1(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle_1 c1 = new Circle_1();
        Circle_1 c2 = new Circle_1(5);

        c1.display();
        c2.display();
    }
}