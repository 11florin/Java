package Arrays;

import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pizza topping do you want?");
        int numTopping = scan.nextInt();
        scan.nextLine(); // Trowaway nextLine() to avoid nextLine() trap
        String[] toppings = new String[numTopping];
     
        System.out.println("Great enter next topping!");
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
        }
        System.out.println("\nConfirm your Order!\n");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }
                
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
    }
}
