public class Player {

    // playerName: string
    String playerName;

    // account : Account
    Account account = new Account();

    // setPleyerName()

    /**
     * Player gets name set.
     * @param Name
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
     * @param value
     */
    public void addValue(int value){
        account.addValue(value);
    }
}
