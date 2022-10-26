public class DieCup {
    private int[] DiceArray;
    private int DieCount;
    //A contructer that makes an Array of int and sets the die count.
    public DieCup(int dieCount) {
        DiceArray = new int[dieCount];
        DieCount = dieCount;
    }

    /**
     * Throws the dice
     */
    public void throwDice() {
        //Makes a variable called "generateDie" as a new Die() class.
        Die generateDie = new Die();
        //A loop that "throws" the dice and sets each value in DiceArray
        for (int i = 0; i < DieCount; i++) {
            DiceArray[i] = generateDie.Throw();
        }
    }

    /**
     * Gets the total sum of the dice values
     * @return Total sum of the dice values
     */
    public int getTotalValue() {
        int sum = 0; //The start sum

        //Iterates through each element in DiceArray.
        for (int i : DiceArray) {
            //Adds the dice value to the total sum.
            sum += i;
        }
        return sum;
    }
}
