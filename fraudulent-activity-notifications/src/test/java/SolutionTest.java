import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase01() {
        final int[] expenditures = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        final int d = 5;

        final int result = Solution.activityNotifications(expenditures, d);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCase02() {
        final int[] expenditures = {1, 2, 3, 4, 4};
        final int d = 4;

        final int result = Solution.activityNotifications(expenditures, d);
        Assert.assertEquals(0, result);
    }


    @Test
    public void testCase03() {
        final int[] expenditures = {10, 20, 30, 40, 50};
        final int d = 3;

        final int result = Solution.activityNotifications(expenditures, d);
        Assert.assertEquals(1, result);
    }

}
