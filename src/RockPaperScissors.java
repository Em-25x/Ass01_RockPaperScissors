import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String cont = "";
        boolean doneCont = false;
        String trashCont = "";
        do {
            String playerAMove = "";
            String playerBMove = "";
            Scanner in = new Scanner(System.in);
            String trash = "";
            boolean doneA = false;
            boolean doneB = false;
            do {
                System.out.print("Player A, what is your move? [RPS]: ");
                playerAMove = in.nextLine();
                if (playerAMove.equalsIgnoreCase("R") || playerAMove.equalsIgnoreCase("P") || playerAMove.equalsIgnoreCase("S")) {
                    doneA = true;
                } else {
                    trash = playerAMove;
                    System.out.println("Invalid input. Must be [RPS], not: " + trash);
                }
            } while (!doneA);
            do {
                System.out.print("Player B, what is your move? [RPS]: ");
                playerBMove = in.nextLine();
                if (playerBMove.equalsIgnoreCase("R") || playerBMove.equalsIgnoreCase("P") || playerBMove.equalsIgnoreCase("S")) {
                    doneB = true;
                } else {
                    trash = playerBMove;
                    System.out.println("Invalid input. Must be [RPS], not: " + trash);
                }
            } while (!doneB);
            if (playerAMove.equalsIgnoreCase("R")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs. Rocks : It's a tie!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock : Player B Wins!");
                } else {
                    System.out.println("Rock breaks Scissors : Player A Wins!");
                }
            } else if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock : Player A Wins!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs. Paper : It's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper : Player B Wins!");
                }
            } else {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors : Player B Wins!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper : Player A Wins!");
                } else {
                    System.out.println("Scissors vs. Scissors : It's a tie!");
                }
            }
            do
            {
                System.out.print("Would you like to play again?: ");
                cont = in.nextLine();
                if (cont.equalsIgnoreCase("Y") || cont.equalsIgnoreCase("N")) {
                    doneCont = true;
                } else {
                    trashCont = cont;
                    System.out.println("Invalid input. Must be [YN], not: " + trashCont);
                }
            }while (!doneCont);
        } while (cont.equalsIgnoreCase("Y"));
    }
}