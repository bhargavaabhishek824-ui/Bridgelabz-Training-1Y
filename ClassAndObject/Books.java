package ClassAndObject;
class Books {
	String title;
    String author;
    double price;

    // Default constructor
    Books() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized constructor
    Books(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Books b1 = new Books();
        Books b2 = new Books("Java", "James Gosling", 500);

        b1.display();
        b2.display();
    }
}

