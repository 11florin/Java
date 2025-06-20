package WhileLoop;

import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String username = "Samantha";
        String pasword = "Java<3";

        System.out.println("Welcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String usernameEntry = scan.nextLine();
        System.out.print("- Pasword: ");
        String passwordEntry = scan.nextLine();

        while (!usernameEntry.equals(username) || !passwordEntry.equals(pasword)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Pasword: ");
            passwordEntry = scan.nextLine();
        }
        System.out.println("\nSign in Succesful!");
        scan.close();
    }
}
