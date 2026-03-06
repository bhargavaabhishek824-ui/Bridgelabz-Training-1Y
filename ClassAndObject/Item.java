package ClassAndObject;
class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    // Method to display item details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    // Method to calculate total cost
    void totalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Item i1 = new Item(101, "Pen", 10);

        i1.displayItem();
        i1.totalCost(5);
    }
}