public class DieCup {
    private int[] DiceArray;
    //DieCount can be changed to any amount if needed.
    private int DieCount = 2;
    //A contructer that makes an Array of int.
    DieCup(int DieCount) {
        DiceArray = new int[DieCount];
    }

    /**
     * Throws the dice
     * @return An array of dice values
     */
    public int[] throwDice() {
        //Makes a Cup variable as an array with DieCount length.
        DieCup Cup = new DieCup(DieCount);
        //Makes a variable called "generateDie" as a new Die() class.
        Die generateDie = new Die();
        //A loop that "throws" the dice and sets each value in DiceArray
        for (int i = 0; i < DieCount; i++) {
            Cup.DiceArray[i] = generateDie.Throw();
        }

        //Returns an array with all the die values.
        return Cup.DiceArray;
    }
}
