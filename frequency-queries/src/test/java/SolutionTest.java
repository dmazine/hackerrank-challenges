import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testCase01() {
        final int[][] queries = {
                {1, 5},
                {1, 6},
                {3, 2},
                {1, 10},
                {1, 10},
                {1, 6},
                {2, 5},
                {3, 2}
        };

        final List<Integer> result = Solution.freqQuery(queries);
        Assert.assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    public void testCase02() {
        final int[][] queries = {
                {3, 4},
                {2, 1003},
                {1, 16},
                {3, 1}
    };

        final List<Integer> result = Solution.freqQuery(queries);
        Assert.assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    public void testCase03() {
        final int[][] queries = {
                {1, 3},
                {2, 3},
                {3, 2},
                {1, 4},
                {1, 5},
                {1, 5},
                {1, 4},
                {3, 2},
                {2, 4},
                {3, 2}
        };

        final List<Integer> result = Solution.freqQuery(queries);
        Assert.assertEquals(Arrays.asList(0, 1, 1), result);
    }

}

