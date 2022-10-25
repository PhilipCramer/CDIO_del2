public class Board {
    Field[] board;


    //Enumerator containing the desired Field names
    private enum BoardLayout {
        START (0, false),
        TOWER (250, false),
        CRATER (-100, false),
        PALACE_GATES (100, false),
        COLD_DESERT (-20, false),
        WALLED_CITY (180, false),
        MONASTERY (0, false),
        BLACK_CAVE (-70, false),
        HUTS_IN_THE_MOUNTAIN (60, false),
        THE_WEREWALL (-80, true),
        THE_PIT (-50, false),
        THE_GOLDMINE (650, false);

        private final int effect;
        private final boolean extraTurn;
        BoardLayout(int effect, boolean ExtraTurn){
            this.effect = effect;
            this.extraTurn = ExtraTurn;
        }
    }

    /**
     * Constructs an array of fields based on the enumerator
     * and sets the names correspondingly
     */
    public Board(){
        int i = 0;
        //Iterates over the enumerator instantiating the fields and assigning names
        for(BoardLayout bL : BoardLayout.values()){
            board[i] = new Field();
            // board[i].setName(bL);

            i++;
        }
    }

    /**
     *
     * @param DiceRollSum enter the sum of the rolled diced.
     * @return returns the integer effect to be further processed
     */
    public int getFieldEffect(int DiceRollSum){
        //returns the effect from the field
        return 0;
    }

    /**
     * Method for getting a descriptive text correspondig to the field the player has landed on
     * @param DiceRollSum enter the sum of the rolled diced.
     * @return returns the action as text corresponding to the field
     */
    public String getFieldText(int DiceRollSum){
        String name = board[DiceRollSum +1].getName().replace("_", " ").toLowerCase(); //+1 to account for array 0 indexing
        String str = "You have arrived at " + name;

        //checks if the user gains or loses point and changes accordingly
        if(getFieldEffect(DiceRollSum) < 0){
            str += ", you lose " + Math.abs(getFieldEffect(DiceRollSum)) + " points.";
        } else if(getFieldEffect(DiceRollSum) == 0){
            str += ", it's peaceful and quiet but with 0 effect.";
        }else{
            str += ", you gain " + Math.abs(getFieldEffect(DiceRollSum)) + " points.";
        }

        // Adds the roll again text if user lands at the Werewall
        if(DiceRollSum == 10){
            str += " Roll again.";
        }
        return str;
    }

    /**
     * Method for determining if the player has landed on a field that awards an extra turn
     * @param DiceRollSum enter the sum of the rolled dice
     * @return returns a boolean representing if the player receives an extra turn
     */
    public boolean getExtraTurn(int DiceRollSum){
        if(DiceRollSum == 10){
            return true;
        }else return false;
    }
}
