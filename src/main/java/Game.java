
//import of the java scanner
import java.util.Scanner;
public class Game {
    public Game() {
        Scanner sc = new Scanner(System.in);

        // initialize board
        Board board = new Board();

        // initialize dicecup
        DiceCup diceCup = new DiceCup();

        // welcome players, ask for name for player 1
        System.out.println("Welcome!\nPlease enter the name of player one:");
        String player1 = sc.nextLine().trim();

        // initialize player1
        Player p1 = new Player(player1);

        // ask for name for player 2
        System.out.println("Now enter the name of player two:");
        String player2 = sc.nextLine().trim();

        // initialize player2
        Player p2 = new Player(player2);

        // set active player
        Player currentPlayer = p1;

        // game start
        while (true) {
            // ask player 1 to throw dice by pressing enter
            System.out.println(currentPlayer.getPlayerName() + " press enter to throw dice");
            String start = sc.nextLine();
            while (!start.equals("")) {
                // ask player to press enter
                System.out.println("input not understood.\nPress enter to throw dice");
                start = sc.nextLine();
                continue;
            }
            // throw the dice
            diceCup.throwDice();

            // tell player their dice result
            System.out.println("You got a " + diceCup.getTotalValue());

            // uncomment below if player should also know the individual dice and the total
            // dice value
            // System.out.println("you got a " + diceCup.getDiceValue() + " and " +
            // diceCup.getDiceValue() + " = " + diceCup.getTotalValue());

            // tell the player where they landed
            System.out.println(board.getFieldText(diceCup.getTotalValue()));

            // apply effect
            currentPlayer.setBalance(board.getFieldEffect(diceCup.getTotalValue()));

            // check if player won
            boolean winner = currentPlayer.balanceCheck();
            if (winner == true) {
                // insert nested if statement, if check for round equality is neccersary
                if (currentPlayer == p1) {
                    System.out.println(currentPlayer.getPlayerName()
                            + " congratulations you've hit the threshold with a balance of "
                            + currentPlayer.getBalance() + "!");
                    System.out.println(
                            "But because you are player one, player two will get a last turn to see if they can draw the game.");
                    currentPlayer = p2;
                    System.out.println(currentPlayer.getPlayerName() + " press enter to throw the dice a last time..");
                    String lastThrow = sc.nextLine();
                    while (!lastThrow.equals("")) {
                        // ask player to press enter
                        System.out.println("input not understood.\nPress enter to throw dice");
                        lastThrow = sc.nextLine();
                        continue;
                    }
                    // throw the dice
                    diceCup.throwDice();

                    // tell player their dice result
                    System.out.println("You got a " + diceCup.getTotalValue());

                    // tell the player where they landed
                    System.out.println(board.getFieldText(diceCup.getTotalValue()));

                    // apply effect
                    currentPlayer.setBalance(board.getFieldEffect(diceCup.getTotalValue()));

                    if (p2.getBalance() < 3000) {
                        // Tell player one that they've won
                        System.out.println("Congratulations " + p1.getPlayerName() + " you've won!\n"
                                + p2.getPlayerName() + " loses the game with a balance of " + p2.getBalance());
                    } else if (p2.getBalance() >= 3000) {
                        // Tell that it is a draw
                        System.out.println("The game is a draw!\n" + p2.getPlayerName()
                                + " managed to reach the threshold of 3000 on their last turn.");
                    }
                }
                // Tell the player they've won
                System.out.println(currentPlayer.getPlayerName() + " congratulations, you've won!");

                // insert possibility to restart game - and exit manually.
                break;
            }
            // check for extra turn
            if (board.getExtraTurn(diceCup.getTotalValue()) == true) {
                // Tell player they've gotten an extra turn
                System.out.println(currentPlayer.getPlayerName() + " press enter to throw the dice");
                if (!start.equals("")) {
                    // ask player to press enter
                    System.out.println("input not understood.\nPress enter to throw dice");
                    continue;
                }
                continue;
            } else if (currentPlayer == p1) {
                currentPlayer = p2;
            } else {
                currentPlayer = p1;
            }
        }
        sc.close();
    }
}