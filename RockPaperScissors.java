import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper or scissors");
        System.out.print("Are you ready? Write 'yes' if you are: ");

        String response = scan.nextLine();

        if (response.equals("yes")){
            System.out.println("Great");
            System.out.println("rock - paper - scissors, shoot");
            String userChoice = scan.nextLine();
            String compChoice = computerChoice();

            String finalResult = result(userChoice, compChoice);
            printResult(userChoice, compChoice, finalResult);
        } else {
            System.out.println("Some other time ...!");
        }
        scan.close();
    }
    /**
     * Method name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the method:
     * 1. Picks a arandom number between 0 and 2.
     * 2. if 0: returns the choice 'rock'
     *    if 1: returns the choice 'paper'
     *    if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int randomNumber = (int)(Math.random() * 3); // 0 - 2
        if (randomNumber == 0) {
            return "rock";
        } else if ( randomNumber == 1) {
            return "paper";
        } else if (randomNumber == 2) {
            return "scissors";
        } else {
            return "Error in the app. Please visit the app";
        }
    }
    /**
     * Method name: result - It returns the result of the game
     * 
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @return result (String)
     * 
     * Inside the method:
     * 
     * 1. result is "You win!" if:
     * you: "rock" Computer: "scissors"
     * You: "paper" Computer: "rock"
     * You: "scissors" Computer: "paper"
     * 
     * 2. result "You lose" if:
     * Computer: "rock" You: "scissors"
     * Computer: "paper" You: "rock"
     * Computer: "scisors" You: "paper"
     * 
     * 3. Otherwise, print "INVALID CHOICE" and exit the program
     * 
     * 
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            return "You lose!";
        } else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            return "You lose!";
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            return "You lose!";
        } else if (yourChoice.equals(computerChoice)) {
            return "It's a tie";
        } else  {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
               
        return result; 
    }
    /**
     * Name: printResult - It prints everything (your choice,  computer choice, reslut)
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     * 
     * Inside the method:
     * 1. prints everethyng:
     * - prints: you chose: yourChoice
     * - prints: The computer chose: computerChose
     * - prints: result
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: "+ computerChoice);
        System.out.println(result);
    }
}
