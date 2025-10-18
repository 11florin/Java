package codingExercise.codingExercise2;

import java.util.ArrayList;

public class Customer {
    
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransaction() {
        return transactions;
    }
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
