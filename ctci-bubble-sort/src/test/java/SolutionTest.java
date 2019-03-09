import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase01() {
        final int[] a = {1, 2, 3};

        final int[] result = Solution.sort(a);
        Assert.assertArrayEquals(new int[]{0, 1, 3}, result);
    }

    @Test
    public void testCase02() {
        final int[] a = {3, 2, 1};

        final int[] result = Solution.sort(a);
        Assert.assertArrayEquals(new int[]{3, 1, 3}, result);
    }

    @Test
    public void testCase03() {
        final int[] a = {4, 2, 3, 1};

        final int[] result = Solution.sort(a);
        Assert.assertArrayEquals(new int[]{5, 1, 4}, result);
    }

}
