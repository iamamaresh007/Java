import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.time.LocalDate;

class Transaction {
    private LocalDate date;
    private int amount;
    
    Transaction(LocalDate date, int amount) {
        this.date = date;
        this.amount = amount;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public int getAmount() {
        return amount;
    }
}


class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(LocalDate.of(2022, 1, 1), 100),
            new Transaction(LocalDate.of(2022, 1, 1), 200),
            new Transaction(LocalDate.of(2022, 1, 2), 300),
            new Transaction(LocalDate.of(2022, 1, 2), 400),
            new Transaction(LocalDate.of(2022, 1, 3), 500));

    Map<LocalDate, Integer> map = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));
    
    System.out.println(map);
    }
}
