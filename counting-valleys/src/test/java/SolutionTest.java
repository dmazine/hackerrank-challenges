import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase0() {
        final int n = 8;
        final String s = "UDDDUDUU";

        final int numberOfValleys = Solution.countingValleys(n, s);
        Assert.assertEquals(1, numberOfValleys);
    }

    @Test
    public void testCase1() {
        final int n = 12;
        final String s = "DDUUDDUDUUUD";

        final int numberOfValleys = Solution.countingValleys(n, s);
        Assert.assertEquals(2, numberOfValleys);
    }

}
