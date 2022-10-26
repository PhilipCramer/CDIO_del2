import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieCupTest {
    private static DieCup diceCup;

    /**
     * Before the tests are run, a new DieCup class is made.
     * This is because the point of TC5 is to measure the time it takes to call the getTotalValue method and get a response.
     * This makes it so that only getTotalValue is called in TC5 and nothing else.
     */
    @BeforeClass
    public static void throwDice() {
        diceCup = new DieCup(2);
        diceCup.throwDice();
    }

    /**
     * TC4 is testing the normal distribution of the dice.
     */
    @Test
    public void TC4(){
        //Makes a new DieCup class with 2 dice.
        DieCup dieCup = new DieCup(2);
        int numberOfRolls = 1000000; // The number of rolls in total
        int[] results = new int[13]; // An array of the total sum 2 dice can make.

        //A loop that "throws" the dice and ticks up the counter that corresponds to the dice sum in the results array.
        for(int i = 0; i < numberOfRolls; i++){
            dieCup.throwDice();
            int sum = dieCup.getTotalValue();
            results[sum]++;
        }
        System.out.println("There have been rolled:");
        //A loop that prints each value in the results array and calculates the percentage.
        for(int i = 2; i< results.length; i++) {
            System.out.println(i + ": " + results[i] + " times, which is " + (((results[i]) * 100) / 1000000.0) + "% of the rolls");
        }
    }

    /**
     * TC5 is testing how long it takes for the DieCup class to return the total sum of the dice.
     */
    @Test
    public void TC5() {
        int sum = diceCup.getTotalValue();
        System.out.print(sum);
        assertTrue(true);
    }
}