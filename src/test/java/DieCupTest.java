import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

public class DieCupTest {
    private static DieCup diceCup;

    @BeforeAll
    public static void throwDice() {
        diceCup = new DieCup(2);
        diceCup.throwDice();
    }

    @Test
    public void TC5() {
        int sum = diceCup.getTotalValue();
    }
}