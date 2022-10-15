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
     *
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

    public int getEffect(int DiceRollSum){
        //returns the effect from the field
        return 0;
    }
}
