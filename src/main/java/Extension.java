import java.util.Scanner;

public class Extension {
    public static void main(String[] args) {
        // Hot = 20+
        // Cold = under 10
        // Mild = 11-19

        // Prompt user to input weather description and average temperature of the day
        System.out.println("What is the weather like today?");
        Scanner scanner = new Scanner(System.in);
        // Collect user input
        String weatherToday = scanner.nextLine();

        System.out.println("What is the temperature today?");
        // Collect user input
        int temperature = scanner.nextInt();

        // If weather is anything above 20 degrees and sunny = wear sunscreen and a hat
        if (temperature >= 20 && weatherToday.equals("sunny")) {
            System.out.println("What a gorgeous day! Wear sunscreen and a hat.");
        }
        // If weather is anything under 10 degrees = wear a jacket
        else if (temperature < 10) {
            if (weatherToday.equals("rainy")) {
                System.out.println("Boo...wear a jacket and bring an umbrella with you.");
            } else {
                System.out.println("Wear a jacket!");
            }
        }
        // If weather is between 11-19 degrees = wear a light jumper
        else if (temperature >= 11 && temperature <= 19) {
            System.out.println("Wear a light jumper!");
        }
        // too many weird combos
        else {
            System.out.println("Use your power of discernment ;)");
        }
    }
}
