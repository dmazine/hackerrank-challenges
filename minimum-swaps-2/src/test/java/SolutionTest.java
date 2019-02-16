import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase1() {
        final int[] arr = { 4, 3, 1, 2 };
        final int result = Solution.minimumSwaps(arr);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testCase2() {
        final int[] arr = { 2, 3, 4, 1, 5 };
        final int result = Solution.minimumSwaps(arr);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testCase3() {
        final int[] arr = { 1, 3, 5, 2, 4, 6, 7 };
        final int result = Solution.minimumSwaps(arr);
        Assert.assertEquals(3, result);
    }
}
