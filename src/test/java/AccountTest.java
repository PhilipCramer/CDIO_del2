import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountTest {
    private Account account;

    @BeforeClass
    public void createAccount() {
        account = new Account();
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void TC1() {
        account.addValue(-500);
        assertEquals(500, account.getBalance());
    }
   
    @Test
    public void TC2(){
        account.addValue(-1001);
        assertEquals(0, account.getBalance());
    }
}
