import org.junit.Assert;
import org.junit.Test;

public class VerifyATest {

    @Test
    public void should_be_zero_when_no_same_figure_and_position() {
        VerifyA countA = new VerifyA();
        int counter = countA.caculatorA(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
        // actual is user input, expected is the correct result
        Assert.assertEquals(0,counter);
    }

    @Test
    public void should_be_one_when_one_same_figure_and_position() {
        VerifyA countA = new VerifyA();
        int counter = countA.caculatorA(new int[]{5, 6, 7, 4}, new int[]{1, 2, 3, 4});
        Assert.assertEquals(1,counter);
    }

    @Test
    public void should_be_four_when_all_same_figure_and_position() {
        VerifyA countA = new VerifyA();
        int counter = countA.caculatorA(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        Assert.assertEquals(4,counter);
    }
}
