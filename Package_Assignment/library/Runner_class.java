package Package_Assignment;
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Runner_class {

    public static void main(String[] args) {

        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        b.addBook("Java Programming", "James Gosling");
        m.registerMember("Rahul", 101);
        t.issueBook("Java Programming", "Rahul");

    }

}
