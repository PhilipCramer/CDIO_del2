public class DieCup {
    private int[] DiceArray;
    private int DieCount = 2; //DieCount can be changed to any amount if needed.

    //A contructer that makes an Array of int.
    public DieCup(int DieCount) {
        DiceArray = new int[DieCount];
    }

    /**
     * Throws the dice
     */
    public void throwDice() {
        //Makes a Cup variable as an array with DieCount length.
        DieCup Cup = new DieCup(DieCount);
        //Makes a variable called "generateDie" as a new Die() class.
        Die generateDie = new Die();
        //A loop that "throws" the dice and sets each value in DiceArray
        for (int i = 0; i < DieCount; i++) {
            Cup.DiceArray[i] = generateDie.Throw();
        }
    }

    /**
     * Gets the total sum of the dice values
     * @return Total sum of the dice values
     */
    public int getTotalValue() {
        int sum = 0;
        //Iterates through each element in DiceArray.
        for (int i : DiceArray) {
            //Adds the dice value to the total sum.
            sum += i;
        }
        return sum;
    }
}
