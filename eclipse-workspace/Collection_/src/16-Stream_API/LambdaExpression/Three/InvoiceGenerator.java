package Three;
import java.util.*;
import java.util.stream.*;
public class InvoiceGenerator {
    static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(101, 102, 103, 104);
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
        invoices.forEach(System.out::println);
    }
}