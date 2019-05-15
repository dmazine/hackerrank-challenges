/*
 * Special Palindrome Again
 *
 * https://www.hackerrank.com/challenges/special-palindrome-again/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        if (n == 0) {
            return 0;

        }

        int equalCharsCount = 1;

        long palindromicSubstringsCount = 0;

        for (int index = 1; index < n; index++) {
            if (s.charAt(index) == s.charAt(index - 1)) {
                equalCharsCount++;
            } else {
                palindromicSubstringsCount += getPalindromicSubstringsCountFromEqualChars(equalCharsCount);
                palindromicSubstringsCount += getPalindromicSubstringsCountFromMiddleChar(s, index, equalCharsCount);
                equalCharsCount = 1;
            }
        }

        palindromicSubstringsCount += getPalindromicSubstringsCountFromEqualChars(equalCharsCount);

        return palindromicSubstringsCount;
    }

    private static long getPalindromicSubstringsCountFromEqualChars(int equalCharsCount) {
        // https://mathbitsnotebook.com/Algebra2/Sequences/SSGauss.html
        return (equalCharsCount * (equalCharsCount + 1)) / 2;
    }

    private static long getPalindromicSubstringsCountFromMiddleChar(String s, int middleIndex, int maxCharsCount) {
        long palindromicSubstringsCount = 0;

        for (int leftIndex = middleIndex - 1, rightIndex = middleIndex + 1, charsCount = 0;
             leftIndex >= 0 && rightIndex < s.length() && charsCount < maxCharsCount && s.charAt(leftIndex) == s.charAt(rightIndex);
             leftIndex--, rightIndex++, charsCount++) {
            palindromicSubstringsCount++;
        }

        return palindromicSubstringsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
