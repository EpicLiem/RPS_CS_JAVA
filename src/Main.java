import java.util.Scanner;
import java.util.Random;
public class Main {
    // decided to split all scenarios into different if statements
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors! First to lead by 5 wins!(1/32 chance of that happening)");
        int computerscore = 0;
        int playerscore = 0;
        Random rand = new Random();
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("The score is " + playerscore + "(Player) to " + computerscore + "(Computer)");
            Scanner input = new Scanner(System.in);
            System.out.println("Rock, Paper, or Scissors?(R/P/S)");
            String userChoice = input.nextLine();
            userChoice = userChoice.toUpperCase();
            System.out.println(userChoice);
            int userChoiceInt = 0;
            if (userChoice.equals("R")) {
                System.out.println("You chose Rock!");
                userChoiceInt = 0;
            } else if (userChoice.equals("P")) {
                System.out.println("You chose Paper!");
                userChoiceInt = 1;
            } else if (userChoice.equals("S")) {
                System.out.println("You chose Scissors!");
                userChoiceInt = 2;
            } else {
                System.out.println("Invalid input!");
                continue;
            }
            int computerChoice = rand.nextInt(3);
            if (computerChoice == 0) {
                System.out.println("The computer chose Rock!");
            } else if (computerChoice == 1) {
                System.out.println("The computer chose Paper!");
            } else if (computerChoice == 2) {
                System.out.println("The computer chose Scissors!");
            }
            if (computerChoice == userChoiceInt) {
                System.out.println("You Tied");
                System.out.println("If it doesn't matter who wins or loses, then why do they keep score?");
            }
            else if (computerChoice == 0 && userChoiceInt == 1) {
                System.out.println("You Won!");
                System.out.println("All games are basically hostile. Winners and losers. We see them all around us: the winners and the losers. The losers can oftentimes become winners, and the winners can very easily become losers.");
                playerscore++;
            }
            else if (computerChoice == 0 && userChoiceInt == 2) {
                System.out.println("You Lost!");
                System.out.println("Winning is a state of mind that embraces everything you do.");
                computerscore++;
            }
            else if (computerChoice == 1 && userChoiceInt == 0) {
                System.out.println("You Lost!");
                System.out.println("Winning is a state of mind that embraces everything you do.");
                computerscore++;
            }
            else if (computerChoice == 1 && userChoiceInt == 2) {
                System.out.println("You Won!");
                System.out.println("All games are basically hostile. Winners and losers. We see them all around us: the winners and the losers. The losers can oftentimes become winners, and the winners can very easily become losers.");
                playerscore++;
            }
            else if (computerChoice == 2 && userChoiceInt == 0) {
                System.out.println("You Won!");
                System.out.println("All games are basically hostile. Winners and losers. We see them all around us: the winners and the losers. The losers can oftentimes become winners, and the winners can very easily become losers.");
                playerscore++;
            }
            else if (computerChoice == 2 && userChoiceInt == 1) {
                System.out.println("You Lost!");
                System.out.println("Winning is a state of mind that embraces everything you do.");
                computerscore++;


            }
            if (computerscore - playerscore >= 5) {
                System.out.println("You Lost the Game!");
                playAgain = false;
            }
            else if (playerscore - computerscore >= 5) {
                System.out.println("You Won the Game!");
                playAgain = false;
            }
        }

    }
}