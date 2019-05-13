import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase01() {
        final int[] arr = {1, 1, 1, 2, 2};

        Assert.assertEquals(0, Solution.countInversions(arr));
    }

    @Test
    public void testCase02() {
        final int[] arr = {2, 1, 3, 1, 2};

        Assert.assertEquals(4, Solution.countInversions(arr));
    }

    @Test
    public void testCase03() {
        final int[] arr = {1, 5, 3, 7};

        Assert.assertEquals(1, Solution.countInversions(arr));
    }

    @Test
    public void testCase04() {
        final int[] arr = {7, 5, 3, 1};

        Assert.assertEquals(6, Solution.countInversions(arr));
    }

    @Test
    public void testCase05() {
        final int[] arr = {1, 3, 5, 7};

        Assert.assertEquals(0, Solution.countInversions(arr));
    }

    @Test
    public void testCase06() {
        final int[] arr = {3, 2, 1};

        Assert.assertEquals(3, Solution.countInversions(arr));
    }

}
