package Arrays;

import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can i help you find?\n");
        String response = scan.nextLine();


        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(response)) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }
        scan.close();
    }
}
