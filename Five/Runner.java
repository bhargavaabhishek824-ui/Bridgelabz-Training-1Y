
package Five;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        FoodItem item1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        order.add(item1);
        order.add(item2);

        double finalBill = 0;

        for (FoodItem item : order) {
            item.getItemDetails();

            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                double discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
                System.out.println("Discount: " + discount);

                total -= discount;
            }

            finalBill += total;
            System.out.println("---------------------------");
        }

        System.out.println("Final Bill Amount: " + finalBill);
    }
}
