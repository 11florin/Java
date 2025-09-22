package constructorChallenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer() {
        this("Florin",  "email@email");
        System.out.println("Empty contructor with some value for each argument");
    }
    public Customer(String name, String emailAddress) {
        this(name, 500.00, emailAddress);
        System.out.println("Constructor with name and email wich also cals another constructor");
    }
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmaliAddress() {
        return emailAddress;
    }
}
