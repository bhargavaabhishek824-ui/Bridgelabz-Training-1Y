package library.books;
public class Book {
    String title;
    String author;
    public void addBook(String t, String a) {
        title = t;
        author = a;
        System.out.println("Book Added:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}