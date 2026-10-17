import java.util.Random;
import java.util.Scanner;

public class Task8DiceRoller {
    static void main(String[] args) {
        // Declarations
            Random roller = new Random();
            Scanner in = new Scanner(System.in);
            int diceOne;
            int diceTwo;
            int diceThree;
            int sum;
            int count = 1;
            String response;
            boolean triple = false;
            boolean repeat = true;
            boolean valid = false;
        // IPO
        while(repeat) {
            System.out.printf("%-8s %-8s %-8s %-8s %s%n", "Roll", "Dice1", "Dice2", "Dice3", "Sum");
            System.out.println("-------------------------------------------");
            do {
                diceOne = roller.nextInt(1, 7);
                diceTwo = roller.nextInt(1, 7);
                diceThree = roller.nextInt(1, 7);
                sum = diceOne + diceTwo + diceThree;
                System.out.printf("%-8d %-8d %-8d %-8d %d%n", count, diceOne, diceTwo, diceThree, sum);
                if (diceOne == diceTwo && diceTwo == diceThree) {
                    triple = true;
                    count = 1;
                    System.out.println();
                } else {
                    count++;
                }
            } while (!triple);
            triple = false;
            do {
                System.out.print("Would you like to run the dice roller again?>> ");
                response = in.nextLine();
                if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("n") || response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no")) {
                    valid = true;
                } else {
                    System.out.printf("'%s' is not a valid input! Please try again.%n", response);
                }
            } while(!valid);
            valid = false;
            if(response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no")) {
                repeat = false;
            } else {
                System.out.println();
            }
        }
    }
}