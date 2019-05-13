import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase01() {
        final String a = "cde";
        final String b = "abc";

        Assert.assertEquals(4, Solution.makeAnagram(a, b));
    }

    @Test
    public void testCase02() {
        final String a = "fcrxzwscanmligyxyvym";
        final String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        Assert.assertEquals(30, Solution.makeAnagram(a, b));
    }

    @Test
    public void testCase03() {
        final String a = "showman";
        final String b = "woman";

        Assert.assertEquals(2, Solution.makeAnagram(a, b));
    }

}
