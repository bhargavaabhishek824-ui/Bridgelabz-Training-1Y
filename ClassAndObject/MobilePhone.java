package ClassAndObject;
class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S23", 75000);

        m1.displayDetails();
    }
}