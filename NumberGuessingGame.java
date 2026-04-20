import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int theNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean isRunning = true;

        System.out.println("****************************************");
        System.out.println("* Welcome to Java Number Guessing Game *");
        System.out.println("****************************************");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (isRunning) {
            try {
                System.out.print("Your guess is: ");
                int playerGuess = scanner.nextInt();
                attempts++;

                if (playerGuess < 1 || playerGuess > 100) {
                    System.out.println("Please stay within the range (1-100)!");
                } else if (playerGuess < theNumber) {
                    System.out.println("Too low! Try again.");
                } else if (playerGuess > theNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You found it in " + attempts + " attempts.");
                    isRunning = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number.");
                scanner.next();
            }
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}