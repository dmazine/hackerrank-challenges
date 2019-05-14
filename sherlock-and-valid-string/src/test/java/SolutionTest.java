import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase01() {
        final String s = "aabbccddeefghi";
        Assert.assertEquals("NO", Solution.isValid(s));
    }

    @Test
    public void testCase02() {
        final String s = "aabbccddeefghi";
        Assert.assertEquals("NO", Solution.isValid(s));
    }

    @Test
    public void testCase3() {
        final String s = "abcdefghhgfedecba";
        Assert.assertEquals("YES", Solution.isValid(s));
    }

    @Test
    public void testCase4() {
        final String s = "aabbcc";
        Assert.assertEquals("YES", Solution.isValid(s));
    }

    @Test
    public void testCase5() {
        final String s = "abbbcccddd";
        Assert.assertEquals("YES", Solution.isValid(s));
    }

    @Test
    public void testCase6() {
        final String s = "aabbcccddee";
        Assert.assertEquals("YES", Solution.isValid(s));
    }

}
