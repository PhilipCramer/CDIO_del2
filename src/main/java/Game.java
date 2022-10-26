import java.util.Scanner;
//imports java scanner
public class Game {
    //declares a scanner variable
    private Scanner sc;
    
    private final static int WINNER_SCORE = 3000;
    private final static int DIE_COUNT = 2;

    /**
     * 
     * @param scanner takes a scanner as input to take player inputs.
     */
    public Game(Scanner scanner) {
        this.sc = scanner;

        // initialize board
        Board board = new Board();

        // initialize dicecup with 2 dice
        DieCup diceCup = new DieCup(DIE_COUNT);

        // welcome players, ask for name for player 1
        System.out.print("Welcome!\nPlease enter the name of player one:\n");
        String player1 = sc.nextLine().trim();

        // initialize player1
        Player p1 = new Player(player1);

        // ask for name for player 2
        System.out.print("\nNow enter the name of player two:\n");
        String player2 = sc.nextLine().trim();

        // initialize player2
        Player p2 = new Player(player2);

        // set active player
        Player currentPlayer = p1;

        // game start
        while (true) {
            // ask player 1 to throw dice by pressing enter
            System.out.print("\n" + currentPlayer.getPlayerName() + " press enter to throw dice");
            String start = sc.nextLine();
            while (!start.equals("")) {
                // ask player to press enter
                System.out.print("input not understood.\nPress enter to throw dice");
                start = sc.nextLine();
                continue;
            }
            // throw the dice
            diceCup.throwDice();

            // tell player their dice result
            System.out.println("You got a " + diceCup.getTotalValue());

            // uncomment below if player should also know the individual dice and the total
            // dice value
            // System.out.print("you got a " + diceCup.getDiceValue() + " and " +
            // diceCup.getDiceValue() + " = " + diceCup.getTotalValue());

            // tell the player where they landed
            System.out.println(board.getFieldText(diceCup.getTotalValue()));

            // apply effect
            currentPlayer.setPlayerBalance(board.getFieldEffect(diceCup.getTotalValue()));

            // check if player won
            boolean isWinner = currentPlayer.checkPlayerBalance(WINNER_SCORE);
            if (isWinner) {
                // insert nested if statement, if check for round equality is neccersary
                if (currentPlayer == p1) {
                    System.out.print(currentPlayer.getPlayerName()
                            + " congratulations you've hit the threshold with a balance of "
                            + currentPlayer.getPlayerBalance() + "!");
                    System.out.println("\nBut because you are player one, player two will get a last turn to see if they can draw the game.\n");
                    currentPlayer = p2;
                    System.out.print(currentPlayer.getPlayerName() + " press enter to throw the dice a last time..");
                    String lastThrow = sc.nextLine();
                    while (!lastThrow.equals("")) {
                        // ask player to press enter
                        System.out.print("input not understood.\nPress enter to throw dice");
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
                    currentPlayer.setPlayerBalance(board.getFieldEffect(diceCup.getTotalValue()));

                    if (!p2.checkPlayerBalance(WINNER_SCORE)) {
                        // Tell player one that they've won
                        System.out.println("\nCongratulations " + p1.getPlayerName() + " you've won!\n"
                                + p2.getPlayerName() + " loses the game with a balance of " + p2.getPlayerBalance());

                    } else {
                        // Tell that it is a draw
                        System.out.println("\nThe game is a draw!\n" + p2.getPlayerName()
                                + " managed to reach the threshold of 3000 on their last turn.");
                    }
                break;
                }
                // Tell the player they've won
                System.out.println(currentPlayer.getPlayerName() + " congratulations, your balance is " + currentPlayer.getPlayerBalance() + "!\nYou've won!");
                break;
            }
            // Tell the player their new balance
            System.out.println("Your balance is " + currentPlayer.getPlayerBalance() + "!");
            // check for extra turn
            if (board.getExtraTurn(diceCup.getTotalValue())) {
                continue;
            } else if (currentPlayer == p1) {
                currentPlayer = p2;
            } else {
                currentPlayer = p1;
            }
        }
    }
}