package challenge.challenge2;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
        new ArrayList<Double>(500));
        transaction.add(initialDeposit);  
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -75.01);
        bank.printStatment("Jane a");

        //bank.addNewCustomer("bob s", 25);
        bank.addTransaction("Bob S", 100);
        bank.printStatment("Bob S");
    }
}
class Bank {  //Customer is only accseed trough bank
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank (String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bank name = " + name + "\n" + " Customer  = " + customers;
    }
    private Customer getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn/t found %n", customerName);
        return null;
    }
    public void addNewCustomer(String customerName, double initalDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initalDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }
    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transaction().add(transactionAmount);
        }
    }
    public void printStatment(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customerName);
        System.out.println("Transaction: ");
        for (double d : customer.transaction()) { // unboxing 
            System.out.printf("£%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}