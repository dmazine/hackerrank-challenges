import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    private List<Long> arr;

    @Test
    public void testCase01() {
        final List<Long> arr = Arrays.asList(1l, 2l, 2l, 4l);
        long r = 2;

        long result = Solution.countTriplets(arr, r);
        Assert.assertEquals(2l,result);
    }

    @Test
    public void testCase02() {
        final List<Long> arr = Arrays.asList(1l, 3l, 9l, 9l, 27l, 81l);
        long r = 3;

        long result = Solution.countTriplets(arr, r);
        Assert.assertEquals(6l,result);
    }

    @Test
    public void testCase03() {
        final List<Long> arr = Arrays.asList(1l, 5l, 5l, 25l, 125l);
        long r = 5;

        long result = Solution.countTriplets(arr, r);
        Assert.assertEquals(4l,result);
    }

    @Test
    public void testCase04() {
        final List<Long> arr = buildArray(1l, 100);
        long r = 1;

        long result = Solution.countTriplets(arr, r);
        Assert.assertEquals(161700l,result);
    }

    @Test
    public void testCase05() {
        final List<Long> arr = buildArray(1237l, 100000);
        long r = 1;

        long result = Solution.countTriplets(arr, r);
        Assert.assertEquals(166661666700000l,result);
    }

    private static List<Long>buildArray(Long element, int size) {
        final List<Long> arr = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arr.add(element);
        }
        return arr;
    }

}




