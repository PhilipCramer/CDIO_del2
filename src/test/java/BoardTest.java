import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BoardTest {

    Board board;

    @BeforeClass
    public void createBoard(){
        board = new Board();
    }

    @Test
    public void getFieldEffect() {
        int expectedVal = 100;
        int actualVal = board.getFieldEffect(4);
        Assert.assertEquals(actualVal, expectedVal);
    }

    @Test
    public void getFieldText() {
        String expectedVal = "You have arrived at the monastery, it's peaceful and quiet but with 0 effect.";
        String actualVal = board.getFieldText(7);
        Assert.assertEquals(actualVal, expectedVal);
    }

    @Test
    public void getExtraTurn() {
        boolean expectedVal = false;
        boolean actualVal = board.getExtraTurn(4);
        Assert.assertEquals(actualVal, expectedVal);
    }
}