import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase1() {
        final int k = 50;
        final int[] prices = {1, 12, 5, 111, 200, 1000, 10};

        final int result = Solution.maximumToys(prices, k);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testCase2() {
        final int k = 7;
        final int[] prices = {1, 2, 3, 4};

        final int result = Solution.maximumToys(prices, k);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testCase3() {
        final int k = 15;
        final int[] prices = {3, 7, 2, 9, 4};

        final int result = Solution.maximumToys(prices, k);
        Assert.assertEquals(3, result);
    }

}














