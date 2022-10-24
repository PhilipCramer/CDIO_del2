public class Player {

    // playerName: string
    private String playerName;

    // account : Account
    private Account account = new Account();

    // setPleyerName()

    /**
     * Player gets name set.
     * @param Name PlayerName is set to Name
     */
    public void setPlayerName(String Name) {
         playerName = Name;
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
    public void addValue(int value){
        account.addValue(value);
    }
}
