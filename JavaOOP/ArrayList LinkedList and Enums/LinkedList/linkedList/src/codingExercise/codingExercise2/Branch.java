package codingExercise.codingExercise2;

import java.util.ArrayList;

public class Branch {
    
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String customerName, double initalTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initalTransaction));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double initalTransaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(initalTransaction);
            return true;
        }
        return false;
    }
    public Customer findCustomer(String customerName) {
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
}
