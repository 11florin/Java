package WhileLoop;

public class WhileLoopExaples {
    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled

        int diceRoll = -1;
        while (diceRoll != 6) {
            diceRoll = rollDice();
            System.out.println(diceRoll);

        }
        System.out.println("--------------------------------------");

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        int randomNumber = -1;
        while (randomNumber <= 90) {
            randomNumber = generateRandomNumber();
            System.out.println(randomNumber);
        }
        System.out.println("----------------------------------------");
        // Example 3: Keep doubling a random number until it's greater than 1000
        int number = generateRandomNumber();
        while (number <= 1000) {
            number *= 2;
            System.out.println(number);
        }
        
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

}
