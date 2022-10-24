import java.util.Scanner;

public class Player {

    // playerName: string
    String playerName;

    // account : Account
    Account account = new Account();

    // setPleyerName()
    public void setPlayerName(String Name) {
         playerName = Name;
    }

    // getPlayerName(): String
    public String getPlayerName(){
        return playerName;
    }

    // addValue (int value)
    public void addValue(int value){
        account.addValue(value);
    }
}
