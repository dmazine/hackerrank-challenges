import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase0() {
        String s = "aba";
        long n = 10l;

        long result = Solution.repeatedString(s, n);
        Assert.assertEquals(7l, result);
    }

    @Test
    public void testCase2() {
        String s = "a";
        long n = 1000000000000l;

        long result = Solution.repeatedString(s, n);
        Assert.assertEquals(1000000000000l, result);
    }

}
