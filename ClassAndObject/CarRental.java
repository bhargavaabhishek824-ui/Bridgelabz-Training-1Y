package ClassAndObject;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int costPerDay = 1000;

    // Constructor
    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    int calculateCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Abhishek", "Swift", 3);
        c.display();
    }
}