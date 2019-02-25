import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase0() {
        final int n = 5;
        final int[][] queries = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };

        final long result = Solution.arrayManipulation(n, queries);
        Assert.assertEquals(200, result);
    }

    @Test
    public void testCase1() {
        final int n = 10;
        final int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1},
        };

        final long result = Solution.arrayManipulation(n, queries);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testCase2() {
        final int n = 10;
        final int[][] queries = {
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}
        };

        final long result = Solution.arrayManipulation(n, queries);
        Assert.assertEquals(31, result);
    }

}
