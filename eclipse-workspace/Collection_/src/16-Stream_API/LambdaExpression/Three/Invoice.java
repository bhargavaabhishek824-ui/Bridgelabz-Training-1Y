package Three;

public class Invoice {
    int transactionId;

    Invoice(int transactionId){
        this.transactionId = transactionId;
    }

    public String toString(){
        return "Invoice Id: "+transactionId;
    }
}