import org.junit.Assert;

public class SolutionTest {

    @org.junit.Test
    public void testCase0() {
        final int n = 9;
        final int[] ar = { 9, 10, 20, 20, 10, 10, 30, 50, 10, 20 };

        final int numberOfPairs = Solution.sockMerchant(n, ar);
        Assert.assertEquals(3, numberOfPairs);
    }

    @org.junit.Test
    public void testCase1() {
        final int n = 10;
        final int[] ar = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };


        final int numberOfPairs = Solution.sockMerchant(n, ar);
        Assert.assertEquals(4, numberOfPairs);
    }

}
