public class Player {


    private final String playerName;

    private Account account;

    /**
     * Player constructor
     * @param PlayerName enter the desired name for the player
     */
    public Player(String PlayerName){
        playerName = PlayerName;
        account = new Account();
    }



    // getPlayerName(): String
    public String getPlayerName(){
        return playerName;
    }

    // addValue (int value)

    /**
     * Value is the amount of points the player lands on.
     * @param value Account gets the ablility to get added value.
     */
    public void setPlayerBalance(int value){
        this.account.addValue(value);
    }

    /**
     * For reading value of player balance
     * @return returns the players balance as integer
     */
    public int getPlayerBalance(){
        return this.account.getBalance();
    }

    /**
     * check if the player's account has reach the win condition
     * @return returns true if the player has 3000 points
     */
    public boolean checkPlayerBalance(int amount){
        return this.account.balanceCheck(amount);
    }
}
