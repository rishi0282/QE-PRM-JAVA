import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class RPS_Activity {
    public static void main(String[] args) {
        Map<Integer, String> choice_mapping = new HashMap<>();
        choice_mapping.put(1, "ROCK");
        choice_mapping.put(2, "PAPER");
        choice_mapping.put(3, "SCISSORS");

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("\nEnter your choice: 1. ROCK | 2. PAPER | 3. SCISSORS");
            int P1 = 0;

            try {
                P1 = scanner.nextInt();
                if (P1 < 1 || P1 > 3) {
                    System.out.println("Invalid number! Only 1, 2, or 3 are allowed.");
                    continue; // Skip the rest of the loop and ask again
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter only numbers.");
                scanner.next(); // Clear the invalid input from the buffer
                continue;
            }

            System.out.println("You have chosen: " + choice_mapping.get(P1));

            int computer = rand.nextInt(1) + 1; // Generates 1, 2, or 3
            System.out.println("Computer has chosen: " + choice_mapping.get(computer));

            // Logic to determine winner
            if (P1 == computer) {
                System.out.println("It's a Draw!");
            } else if ((P1 == 1 && computer == 3) || 
                       (P1 == 2 && computer == 1) || 
                       (P1 == 3 && computer == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println("\nPlay Again? (y/n)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}