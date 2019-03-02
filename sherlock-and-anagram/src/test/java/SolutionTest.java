import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase0() {
        final String s = "abba";

        final int result = Solution.sherlockAndAnagrams(s);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testCase1() {
        final String s = "abcd";

        final int result = Solution.sherlockAndAnagrams(s);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCase2() {
        final String s = "ifailuhkqq";

        final int result = Solution.sherlockAndAnagrams(s);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testCase3() {
        final String s = "kkkk";

        final int result = Solution.sherlockAndAnagrams(s);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testCase4() {
        final String s = "cdcd";

        final int result = Solution.sherlockAndAnagrams(s);
        Assert.assertEquals(5, result);
    }

}
