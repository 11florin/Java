package classesChallenge;

public class Account {
    

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this("56789", 2.50, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }
    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.05, customerName, customerEmail, customerPhone);
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.customerPhone = customerPhone;
    }
    public void depositFounds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFounds(double withdrawlAmount) {
        if (balance - withdrawlAmount < 0) {
            System.out.println("Insufficient Founds! You only have $" + balance + " in your account");
        } else {
            balance -= withdrawlAmount;
            System.out.println("Withdrawl of $" + withdrawlAmount + " procesed, Remainig balance = $" + balance);
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


    
}
