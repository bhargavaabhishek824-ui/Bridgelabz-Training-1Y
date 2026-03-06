package ClassAndObject;
class Book {
	String title;
  String author;
  double price;
  boolean available = true;

  void borrowBook() {
      if (available) {
          available = false;
          System.out.println("Book Borrowed");
      } else {
          System.out.println("Book Not Available");
      }
  }

  void display() {
      System.out.println(title + " " + author + " " + price + " Available: " + available);
  }

  public static void main(String[] args) {
      Book b = new Book();
      b.title = "Java";
      b.author = "James";
      b.price = 500;

      b.display();
      b.borrowBook();
      b.display();
  }
}