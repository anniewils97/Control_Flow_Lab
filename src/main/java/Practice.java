import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Hot = 20+
//        Cold = under 5
//        Mild = 6-14

// Prompt user to input weather description and avg temperature of the day
        System.out.println("What is the weather like today?");
        Scanner scanner = new Scanner(System.in);
//        Collect user input
        String weatherToday = scanner.nextLine();

        System.out.println("What is the temperature today?");
//        Collect user input
        int temperature = scanner.nextInt();
        int tooHot = 20;
        int tooCold = 10;

// If weather is anything above 20 degrees = wear sunscreen
// If weather is anything under 10 degrees = wear a jacket
        if (temperature == tooHot && weatherToday.equals("sunny")) {
            System.out.println("What a gorgeous day! Wear sunscreen and a hat.");
        } else if (temperature >= tooHot) {
            System.out.println("Wear sunscreen!");
        } else if (temperature == tooCold && weatherToday.equals("rainy")) {
            System.out.println("Boo...wear a jacket and bring an umbrella with you.");
        } else if (temperature <= tooCold) {
            System.out.println("Wear a jacket!");
        } else {
            System.out.println("Use your power of discernment ;)");
        }

// If weather is rainy = bring an umbrella

// If weather is sunny = wear a hat

// If weather is temperature is between 11-19 = wear a light jumper
    }
}