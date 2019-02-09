import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase0() {
        final int d = 4;
        final int[] a = {1, 2, 3, 4, 5};
        final int[] expectedResult = {5, 1, 2, 3, 4};

        final int[] result = Solution.rotLeft(a, d);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testCase1() {
        final int d = 10;
        final int[] a = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        final int[] expectedResult = {77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77};

        final int[] result = Solution.rotLeft(a, d);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testCase2() {
        final int d = 13;
        final int[] a = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        final int[] expectedResult = {87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60};

        final int[] result = Solution.rotLeft(a, d);
        Assert.assertArrayEquals(expectedResult, result);
    }

}
