public class Board {
    Field[] Board;


    //Enumerator containing the desired Field names
    private enum FieldNames{
        START,
        TOWER,
        CRATER,
        PALACE_GATES,
        COLD_DESERT,
        WALLED_CITY,
        MONASTERY,
        BLACK_CAVE,
        HUTS_IN_THE_MOUNTAIN,
        THE_WEREWALL,
        THE_PIT,
        THE_GOLDMINE
    }

    /**
     * Constructs an array of fields based on the enumerator
     * and sets the names correspondingly
     */
    public Board(){
        int i = 0;
        //Iterates over the enumerator instantiating the fields and assigning names
        for(FieldNames fn : FieldNames.values()){
            Board[i] = new Field();
            // board[i].setName(fn);
            i++;
        }
    }

    /**
     *
     * @param DiceRollSum enter the sum of the rolled diced.
     * @return returns the integer effect to be further processed
     */
    public int getEffect(int DiceRollSum){
        //returns the effect from the field
        return 0;
    }

    /**
     *
     * @param DiceRollSum enter the sum of the rolled diced.
     * @return returns the action as text corresponding to the field
     */
    public String getFieldtext(int DiceRollSum){
        String name = Board[DiceRollSum +1].getName().replace("_", " ").toLowerCase(); //+1 to account for array 0 indexing
        String str = "You have arrived at " + name;

        //checks if the user gains or loses point and changes accordingly
        if(getEffect(DiceRollSum) < 0){
            str += ", you lose " + Math.abs(getEffect(DiceRollSum)) + " points.";
        } else if(getEffect(DiceRollSum) == 0){
            str += ", it's peaceful and quiet but with 0 effect.";
        }else{
            str += ", you gain " + Math.abs(getEffect(DiceRollSum)) + " points.";
        }

        // Adds the roll again text if user lands at the Werewall
        if(DiceRollSum == 10){
            str += " Roll again.";
        }

        return str;
    }
}
