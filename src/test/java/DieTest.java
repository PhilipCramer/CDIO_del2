import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    private static Die die;

    @BeforeClass
    public static void createDie() {
        die = new Die();
    }
    @Test
    public void TC3() {
        int dieValue = die.Throw();
        assertTrue(1 <= dieValue && dieValue <= 6);
    }
}