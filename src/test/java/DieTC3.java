import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTC3 {

    @Test
    public void Throw() {
        Die die = new Die();
        int dieValue = die.Throw();
        assertTrue(1 <= dieValue && dieValue <= 6);
    }
}