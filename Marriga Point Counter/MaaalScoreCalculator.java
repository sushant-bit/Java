import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// A class to hold a player's data
class Player {
    String name;
    int points;
    boolean hasSeen;
    int finalScore;

    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.hasSeen = false;
        this.finalScore = 0;
    }
}

public class MaaalScoreCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("      Maaal (Marriage) Card Game Scorekeeper    ");
        System.out.println("===============================================");
        System.out.println("This tool calculates scores and determines the winner.");
        System.out.println("It follows a common scoring rule where the winner collects");
        System.out.println("points from the losers.");
        System.out.println();

        try {
            // Get the number of players
            System.out.print("Enter the number of players (2-5): ");
            int numPlayers = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (numPlayers < 2 || numPlayers > 5) {
                System.out.println("Invalid number of players. Exiting.");
                return;
            }

            // Create a list to store player data
            List<Player> players = new ArrayList<>();
            for (int i = 0; i < numPlayers; i++) {
                System.out.print("Enter name for Player " + (i + 1) + ": ");
                String name = scanner.nextLine();
                players.add(new Player(name));
            }

            System.out.println("\n--- Enter each player's points ---");

            // Loop through each player to get their points and status
            for (Player player : players) {
                System.out.println("\nFor " + player.name + ":");

                System.out.print("Was their hand 'seen' (y/n)? ");
                String seenInput = scanner.nextLine().toLowerCase();
                player.hasSeen = seenInput.equals("y");

                System.out.print("Enter the total points (maal) from their hand: ");
                player.points = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
            }

            // Find the winner (the player who declared the game)
            // This is the player with the highest total points.
            Player winner = players.stream()
                                    .max(Comparator.comparingInt(p -> p.points))
                                    .orElse(null);

            if (winner == null) {
                System.out.println("Could not determine a winner. Exiting.");
                return;
            }

            System.out.println("\n---------------------------------------------");
            System.out.println("The winner is " + winner.name + " with " + winner.points + " points!");
            System.out.println("---------------------------------------------");

            // Calculate point distribution
            for (Player player : players) {
                if (player == winner) {
                    // Winner's points are calculated by summing points from losers
                    for (Player loser : players) {
                        if (loser != winner) {
                            int pointsToCollect = 0;
                            // Common rules:
                            // Winner gets 3 points from players who have 'seen'
                            // Winner gets 10 points from players who are 'unseen'
                            if (loser.hasSeen) {
                                pointsToCollect = 3;
                            } else {
                                pointsToCollect = 10;
                            }
                            winner.finalScore += pointsToCollect;
                        }
                    }
                } else {
                    // Losers pay based on their 'seen' status
                    if (player.hasSeen) {
                        player.finalScore = -3;
                    } else {
                        player.finalScore = -10;
                    }
                }
            }

            // Display final scores
            System.out.println("\n--- Final Scoreboard ---");
            for (Player player : players) {
                System.out.println(player.name + ": " + player.finalScore + " points");
            }
            System.out.println("---------------------------------------------");

        } catch (Exception e) {
            System.out.println("\nInvalid input. Please enter a numerical value where requested.");
        } finally {
            scanner.close();
            System.out.println("\nThank you for using the Maaal Scorekeeper.");
        }
    }
}
