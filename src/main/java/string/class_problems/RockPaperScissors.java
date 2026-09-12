package string.class_problems;

import java.util.Random;

public class RockPaperScissors {

    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        boolean playerWins =
                (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"));
        return playerWins ? "Player Wins" : "Computer Wins";
    }

    public static void main(String[] args) {
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        int rounds = playerMoves.length;

        String[] roundResults = new String[rounds];
        String[] computerMoves = new String[rounds];

        Random random = new Random();
        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < rounds; i++) {
            computerMoves[i] = MOVES[random.nextInt(MOVES.length)];
            roundResults[i] = playRound(playerMoves[i], computerMoves[i]);

            if (roundResults[i].equals("Player Wins")) {
                wins++;
            } else if (roundResults[i].equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        System.out.printf("%-8s %-15s %-15s %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-8d %-15s %-15s %-15s%n", (i + 1), playerMoves[i], computerMoves[i], roundResults[i]);
        }

        double winPercentage = (wins * 100.0) / rounds;
        System.out.println();
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, winPercentage);
    }
}
