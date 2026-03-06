package ClassAndObject;
class Book_1{

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book_1 {

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook b = new EBook();
        b.ISBN = "12345";
        b.title = "Java Programming";
        b.setAuthor("James Gosling");

        b.display();
    }
}