import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase01() {
        final String s = "AAAA";
        Assert.assertEquals(3, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase02() {
        final String s = "BBBBB";
        Assert.assertEquals(4, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase03() {
        final String s = "ABABABAB";
        Assert.assertEquals(0, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase04() {
        final String s = "BABABA";
        Assert.assertEquals(0, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase05() {
        final String s = "AAABBB";
        Assert.assertEquals(4, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase06() {
        final String s = "AAABBBAABB";
        Assert.assertEquals(6, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase07() {
        final String s = "AABBAABB";
        Assert.assertEquals(4, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase08() {
        final String s = "ABABABAA";
        Assert.assertEquals(1, Solution.alternatingCharacters(s));
    }

    @Test
    public void testCase09() {
        final String s = "ABBABBAA";
        Assert.assertEquals(3, Solution.alternatingCharacters(s));
    }

}
