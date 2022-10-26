import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    private static Die die;

    /**
     * Before the tests are run, a new Die class is made.
     */
    @BeforeClass
    public static void createDie() {
        die = new Die();
    }

    /**
     * TC3 test if the die will return a number that is unexpected (<1 or >6).
     */
    @Test
    public void TC3() {
        //A loop that throws the die 1000 times and checks if the value is as expected.
        for (int i = 0; i < 1000; i++) {
            //The die is thrown and a random number is returned.
            int dieValue = die.Throw();
            //Testing weather or not the dieValue is between 1 and 6.
            assertTrue(1 <= dieValue && dieValue <= 6);
        }
    }
}