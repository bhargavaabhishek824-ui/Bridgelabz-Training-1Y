package Two;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle car = new Car("UP81AB1234", 2000, "CAR123", 500);
        Vehicle bike = new Bike("UP81CD5678", 500, "BIKE456", 200);
        Vehicle truck = new Truck("UP81EF9012", 4000, "TRUCK789", 1000);
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);
        int days = 3;
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println("--------------------------");
        }
    }
}