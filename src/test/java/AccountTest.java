import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountTest {
    private Account account;

    /*Before the test is run an account object is made, and it is tested for having the correct balance amount */
    @BeforeClass
    public void createAccount() {
        account = new Account();
        assertEquals(1000, account.getBalance());
    }

    /*Tests that the addValue method understands that -500 means subtract */
    @Test
    public void TC1() {
        account.addValue(-500);
        assertEquals(500, account.getBalance());
    }
   
    /*Tests that the balance can't be negative */
    @Test
    public void TC2(){
        account.addValue(-1001);
        assertEquals(0, account.getBalance());
    }
}
