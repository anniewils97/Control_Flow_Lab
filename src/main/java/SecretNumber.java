import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        // Prompt user to input a number

        System.out.println("Let's play a guessing game! What number am I thinking of, between 1-20?");
// Collect user input
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        int correctGuess = 12;
//        If guess is correct, print 'You got it!'

        if (userGuess == correctGuess) {
            System.out.println("You got it right!");
        } else if (userGuess > correctGuess) {
//        If guess is too high, print 'Too high, guess lower!'
            System.out.println("Too high, guess lower!");
//        If number is too low, print 'Too low! Guess higher.'
    } else {
            System.out.println("Too low, guess higher!");
        }
}
}
