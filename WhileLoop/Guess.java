package WhileLoop;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int secretNum = 3;
        System.out.print("I choose a number between 1 and 5. Try to gues it: ");
        int num = scan.nextInt();
        while (num != secretNum) {

            System.out.print("Guess again ");
            num = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }
}
