package library.transactions;

public class Transaction {

    public void issueBook(String bookTitle, String memberName) {

        System.out.println("\nBook Issued Successfully");
        System.out.println("Book: " + bookTitle);
        System.out.println("Issued To: " + memberName);

    }

}