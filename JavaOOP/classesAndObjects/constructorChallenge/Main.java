package constructorChallenge;

public class Main {
    
    public static void main(String[] args) {
        
        Customer customer3Args = new Customer("Florin", 1000.00, "email@email");
        Customer customer0Args = new Customer();
        Customer customer2Args = new Customer("Valentina", "email@val");


        System.out.println("Name: " + customer3Args.getName() + "\nCredit Limit: " + customer3Args.getCreditLimit()
         + "\nEmail: " + customer3Args.getEmaliAddress() + "\n");
         System.out.println("Name: " + customer0Args.getName() + "\nCredit Limit: " + customer0Args.getCreditLimit() + 
         "\nEmail: " + customer0Args.getEmaliAddress() + "\n");
         System.out.println("Name: " + customer2Args.getName() + "\nCredit Limit: " + customer2Args.getCreditLimit()
         + "\nEmail: " + customer2Args.getEmaliAddress() + "\n");

         
    }
}
