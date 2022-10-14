public class Board {
    Field[] Board;

    public Board(int NumberOfFields){
        for(int i =0; i < NumberOfFields; i++){
            Board[i] = new Field(i+1);
        }
    }
}
