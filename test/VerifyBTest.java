import org.junit.Assert;
import org.junit.Test;

public class VerifyBTest {
    @Test
    public void should_be_zero_when_no_same_figure() {
        VerifyB countB = new VerifyB();
        int counter = countB.caculatorB(new int[]{5, 6, 7, 8}, new int[]{1, 2, 3, 4});
        Assert.assertEquals(0,counter);
    }

    @Test
    public void should_be_one_when_one_same_figure() {
        VerifyB countB = new VerifyB();
        int counter = countB.caculatorB(new int[]{1, 6, 7, 8}, new int[]{1, 2, 3, 4});
        Assert.assertEquals(1,counter);
    }

    @Test
    public void should_be_four_when_all_same_figure() {
        VerifyB countB = new VerifyB();
        int counter = countB.caculatorB(new int[]{4, 3, 2, 1}, new int[]{1, 2, 3, 4});
        Assert.assertEquals(4,counter);
    }
}
