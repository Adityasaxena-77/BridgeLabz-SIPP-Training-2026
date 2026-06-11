import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] choice =
                {"Rock", "Paper", "Scissors"};

        System.out.print("Enter Number of Games: ");
        int n = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println(
                    "\n1.Rock 2.Paper 3.Scissors");

            int user = sc.nextInt();

            int computer =
                    (int) (Math.random() * 3) + 1;

            System.out.println(
                    "Computer: " +
                            choice[computer - 1]);

            if (user == computer)
                System.out.println("Draw");

            else if ((user == 1 && computer == 3) ||
                    (user == 2 && computer == 1) ||
                    (user == 3 && computer == 2)) {

                System.out.println("Player Wins");
                playerWins++;
            } else {

                System.out.println("Computer Wins");
                computerWins++;
            }
        }

        System.out.println("\nPlayer Wins = "
                + playerWins);

        System.out.println("Computer Wins = "
                + computerWins);

        System.out.println("Player Win % = "
                + (playerWins * 100.0 / n));

        System.out.println("Computer Win % = "
                + (computerWins * 100.0 / n));
    }
}