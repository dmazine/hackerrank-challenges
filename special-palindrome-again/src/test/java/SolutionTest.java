import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase1() {
        final int n = 5;
        final String s = "asasd";

        Assert.assertEquals(7, Solution.substrCount(n, s));
    }

    @Test
    public void testCase2() {
        final int n = 7;
        final String s = "abcbaba";

        Assert.assertEquals(10, Solution.substrCount(n, s));
    }

    @Test
    public void testCase3() {
        final int n = 4;
        final String s = "aaaa";

        Assert.assertEquals(10, Solution.substrCount(n, s));
    }

}
