import java.util.Scanner;

public class GameControl {

    public static void main(String[] args) {
        // has a boolean variable to determine if the game should restart
        boolean play;

        // initialize a scanner
        Scanner sc = new Scanner(System.in);

        // a loop to start the game and continue if wished by the player
        do {
            play = false;
            // creates a new game to run
            Game game = new Game(sc);
            // asks if the player wants to play again
            System.out.println("Type yes to play again: <yes/y>\nElse press enter to exit: <enter>");
            String restart = sc.nextLine().toLowerCase();
            // restarts if correct input is typed
            if (restart.equals("yes") || restart.equals("y")) {
                play = true;
            } else {
                // exits game
                System.out.println("Thank you for playing!");
            }
        } while (play);

        sc.close();
    }
}
