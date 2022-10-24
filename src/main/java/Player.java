public class Player {


    private String playerName;

    private Account account;

    /**
     * Player constructor
     * @param PlayerName enter the desired name for the player
     */
    public Player(String PlayerName){
        playerName = PlayerName;
        account = new Account();
    }
    // setPleyerName()



    // getPlayerName(): String
    public String getPlayerName(){
        return playerName;
    }

    // addValue (int value)

    /**
     * Value is the amount of points the player lands on.
     * @param value Account gets the ablility to get added value.
     */
    public void setBalance(int value){
        account.addValue(value);
    }
    public int getPlayerBalance(){
        return this.account.getBalance();
    }
}
