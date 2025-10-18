package codingExercise.codingExercise2;

import java.util.ArrayList;

public class Bank {
    
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initalTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initalTransaction);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }
    public Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for brunch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " + customer.getName() + " [" + (i + 1) + "]");

                if (showTransactions) {
                    System.out.println("Tranzacion: ");
                    ArrayList<Double> transaction = customer.getTransaction();
                    for (int j = 0; j < transaction.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transaction.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
