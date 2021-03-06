/*
 * Repeated String challenge solution.
 *
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        final long numberOfRepeatedString = n / s.length();
        final long numberOfRemainingChars = n % s.length();

        return (numberOfRepeatedString * findNumberOfAs(s)) + findNumberOfAs(s.substring(0, (int) numberOfRemainingChars));
    }

    static long findNumberOfAs(String s) {
        return s.chars().filter(c -> c == 'a').count();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
