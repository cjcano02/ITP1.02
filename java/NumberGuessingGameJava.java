 import java.util.Random;
 import java.util.Scanner;

 public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
          
            int targetNumber = random.nextInt(100) + 1;
            int userGuess = 0;
            boolean correctGuess = false;
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            while (!correctGuess) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                
                if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else if (userGuess > targetNumber) {
                    System.out.println("Your guess is too high. Try again!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    correctGuess = true;
                }
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}

 
