import java.util.Random;
public class Die{
    //Minimum value of the die can be changed if needed.
    private int DieMin = 1;
    //Maximum value of the die can be changed if needed.
    private int DieMax = 6;

    /**
     * Generates the random number
     * @return Random int in range from DieMin to DieMax
     */
    public int Throw(){
        Random randomObj = new Random();
        return randomObj.nextInt(DieMax) + DieMin;
    }
}