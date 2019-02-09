import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase0() {
        final int[] c = { 0, 0, 1, 0, 0, 1, 0 };

        final int numberOfJumps = Solution.jumpingOnClouds(c);
        Assert.assertEquals(4, numberOfJumps);
    }

    @Test
    public void testCase1() {
        final int[] c = { 0, 0, 0, 0, 1, 0 };

        final int numberOfJumps = Solution.jumpingOnClouds(c);
        Assert.assertEquals(3, numberOfJumps);
    }

}
