
//                                  TASK 1
//                                 Number Game.

// 1. Generate a random number within a specified range, such as 1 to 100.

// 2. Prompt the user to enter their guess for the generated number.

// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
// is correct, too high, or too low.

// 4. Repeat steps 2 and 3 until the user guesses the correct number.

// You can incorporate additional details as follows:

// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.


import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 8;
        int rounds = 0;
        int wins =0;

        boolean playAgain = true;
        while (playAgain) {
            int numberToGues = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("Welcome to the number guessing game!");
            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have "+ maxAttempts +" attempts to guess the number. Good luck!");

            while (attempts <maxAttempts) {
                System.out.println("Enter your guess: ");
                int userGuess = scanner.nextInt();

                attempts++;
                if (userGuess == numberToGues) {
                    System.out.println("Congratulations! you have guessed the number in attempts "+ attempts +"!");
                    wins++;
                    break;
                }
                else if (userGuess < numberToGues) {
                    System.out.println("Too low! Try again");
                }
                else{
                    System.out.println("Too high! Try again");
                }
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry , you didn't guess the number. The number I was thinking of is " + numberToGues + ".");      
            }
            rounds++;

            System.out.println("Do you want to want to play again? (yes/no): "); 
            String input = scanner.next().toLowerCase();

            playAgain = input.equals("yes");

        }
        System.out.println("Game over! Your final score is:");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Rounds won:" + wins);
    }
}
