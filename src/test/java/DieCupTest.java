import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DieCupTest {
    private static DieCup diceCup;

    @BeforeClass
    public static void throwDice() {
        diceCup = new DieCup(2);
        diceCup.throwDice();
    }

    @Test
    public void TC5() {
        int sum = diceCup.getTotalValue();
    }
}