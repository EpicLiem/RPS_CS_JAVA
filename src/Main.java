import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors! First to lead by 5 wins!(1/32 chance of that happening)");

        int computerscore = 0;
        int playerscore = 0;
        Random rand = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"}; // going to try and take index of this instead of if statements or ? operator
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("The score is " + playerscore + "(Player) to " + computerscore + "(Computer)");
            System.out.println("Rock, Paper, or Scissors?(R/P/S)");
            String userChoice = input.nextLine().toUpperCase();

            int userChoiceInt = "RPS".indexOf(userChoice); // honestly wasn't sure if this would work, but now I feel like a genius
            if (userChoiceInt == -1) {
                System.out.println("Invalid input!");
                continue;
            }

            System.out.println("You chose " + choices[userChoiceInt] + "!");
            int computerChoice = rand.nextInt(3);
            System.out.println("The computer chose " + choices[computerChoice] + "!");

            if (computerChoice == userChoiceInt) {
                System.out.println("You Tied");
                System.out.println("If it doesn't matter who wins or loses, then why do they keep score?");
            } else if ((computerChoice == 0 && userChoiceInt == 1) || (computerChoice == 1 && userChoiceInt == 2) || (computerChoice == 2 && userChoiceInt == 0)) {
                System.out.println("You Won!");
                System.out.println("All games are basically hostile. Winners and losers. We see them all around us: the winners and the losers. The losers can oftentimes become winners, and the winners can very easily become losers.");
                playerscore++;
            } else {
                System.out.println("You Lost!");
                System.out.println("Winning is a state of mind that embraces everything you do.");
                computerscore++;
            }

            if (computerscore - playerscore >= 5) {
                System.out.println("You Lost the Game!");
                break;
            } else if (playerscore - computerscore >= 5) {
                System.out.println("You Won the Game!");
                break;
            }
        }
    }
}