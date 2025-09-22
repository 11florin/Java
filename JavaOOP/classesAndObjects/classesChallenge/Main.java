package classesChallenge;

public class Main {
    
    public static void main(String[] args) {
        
        // Account bobsAccount = new Account("12345", 1000.00, "Bob Brown", 
        // "mayl@bob.com", "07957");
        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getNumber());

        bobsAccount.withdrawFounds(100);
        bobsAccount.depositFounds(250);
        bobsAccount.withdrawFounds(50);

        bobsAccount.withdrawFounds(200);

        bobsAccount.depositFounds(100);
        bobsAccount.withdrawFounds(45.55);
        bobsAccount.withdrawFounds(54.46);

        Account timsAccount = new Account("Florin", "florin@florin", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());
    }
}
