import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase0() {
        final String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        final String[] note = {"give", "one", "grand", "today"};

        final boolean result = Solution.containsAllWords(magazine, note);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testCase1() {
        final String[] magazine = {"two", "times", "three", "is", "not", "four"};
        final String[] note = {"two", "times", "two", "is", "four"};

        final boolean result = Solution.containsAllWords(magazine, note);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testCase2() {
        final String[] magazine = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        final String[] note = {"ive", "got", "some", "coconuts"};

        final boolean result = Solution.containsAllWords(magazine, note);
        Assert.assertEquals(false, result);
    }

}
