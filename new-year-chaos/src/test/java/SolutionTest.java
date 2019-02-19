import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase1() {
        final int[] q = {2, 1, 5, 3, 4};

        final int result = Solution.findNumberOfBribes(q);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testCase2() {
        final int[] q = {2, 5, 1, 3, 4};

        final int result = Solution.findNumberOfBribes(q);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testCase3() {
        final int[] q = {1, 2, 5, 3, 4, 7, 8, 6};

        final int result = Solution.findNumberOfBribes(q);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testCase4() {
        final int[] q = {5, 1, 2, 3, 7, 8, 6, 4};

        final int result = Solution.findNumberOfBribes(q);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testCase5() {
        final int[] q = {1, 2, 5, 3, 7, 8, 6, 4};

        // 1, 2, 5, 3, 7, 8, 6, 4

        // 1, 2, 5, 4, 7, 8, 6, 3
        // 1, 2, 3, 4, 7, 8, 6, 5
        // 1, 2, 3, 4, 5, 8, 6, 7
        // 1, 2, 3, 4, 5, 8, 7, 6
        // 1, 2, 3, 4, 5, 6, 7, 8

        final int result = Solution.findNumberOfBribes(q);
        Assert.assertEquals(7, result);
    }

}
