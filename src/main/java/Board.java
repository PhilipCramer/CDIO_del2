public class Board {
    Field[] Board;

    enum FieldNames{
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
        for(FieldNames fn : FieldNames.values()){
            Board[i] = new Field();
            // board[i].setName(fn);
            i++;
        }
    }

    /**
     *
     * @param DiceRollSum
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
        return "";
    }
}
