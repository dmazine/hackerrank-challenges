import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testCase1() {
        final String s1 = "hello";
        final String s2 = "world";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("YES", result);
    }

    @Test
    public void testCase2() {
        final String s1 = "hi";
        final String s2 = "world";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("NO", result);
    }

    @Test
    public void testCase3() {
        final String s1 = "wouldyoulikefries";
        final String s2 = "abcabcabcabcabcabc";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("NO", result);
    }

    @Test
    public void testCase4() {
        final String s1 = "hackerrankcommunity";
        final String s2 = "cdecdecdecde";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("YES", result);
    }

    @Test
    public void testCase5() {
        final String s1 = "jackandjill";
        final String s2 = "wentupthehill";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("YES", result);
    }

    @Test
    public void testCase6() {
        final String s1 = "writetoyourparents";
        final String s2 = "fghmqzldbc";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("NO", result);
    }

    @Test
    public void testCase7() {
        final String s1 = "aardvark";
        final String s2 = "apple";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("YES", result);
    }

    @Test
    public void testCase8() {
        final String s1 = "beetroot";
        final String s2 = "sandals";

        final String result = Solution.twoStrings(s1, s2);
        Assert.assertEquals("NO", result);
    }

}
