public class Board {
    Field[] Board;

    public Board(int NumberOfFields){
        for(int i =0; i < NumberOfFields; i++){
            Board[i] = new Field();
        }
    }

    public int getEffect(){
        //returns the effect from the field
        return 0;
    }
}
