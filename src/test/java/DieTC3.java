import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTC3 {

    @Test
    public void Throw() {
        Die die = new Die();
        int mynum = die.Throw();
        assertTrue(1 <= mynum && mynum <= 6);
    }
}