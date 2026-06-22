import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Generate computer choice (1-3)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user
        System.out.println("Rock-Paper-Scissors Game");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1-3): ");

        int userChoice = input.nextInt();

        // Convert numbers to names
        String computerMove = "";
        String userMove = "";

        switch (computerChoice) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
        }

        switch (userChoice) {
            case 1:
                userMove = "Rock";
                break;
            case 2:
                userMove = "Paper";
                break;
            case 3:
                userMove = "Scissors";
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                return;
        }

        // Display selections
        System.out.println("\nComputer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        // Determine winner
        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }
}