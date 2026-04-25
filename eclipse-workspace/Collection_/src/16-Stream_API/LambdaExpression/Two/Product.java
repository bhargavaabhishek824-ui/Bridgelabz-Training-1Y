package Two;
public class Product {
    String name;
    double price;
    double rating;
    double discount;
    Product(String anme, double price, double rating, double discount ){
        this.name = name;
        this.price  = price;
        this.rating = rating;
        this.discount = discount;
    }
    public String tostring(){
        return name +" | Price :- "+price +" | Rating :- "+rating +" | Discount :- "+discount;
    }
}