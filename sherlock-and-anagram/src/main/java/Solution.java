/*
 * Sherlock and Anagrams challenge.
 *
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int anagramsCount = 0;

        for (int wordLength = 1; wordLength < s.length(); wordLength++) {
            anagramsCount += countAnagrams(s, wordLength);
        }

        return anagramsCount;
    }

    private static int countAnagrams(String s, int wordLength) {
        int anagramsCount = 0;

        for (int currentWordStart = 0; currentWordStart + wordLength < s.length(); currentWordStart ++) {
            final int currentWordHashCode = sortString(s.substring(currentWordStart, currentWordStart + wordLength)).hashCode();

            for (int anagramStart = currentWordStart + 1; anagramStart + wordLength <= s.length(); anagramStart++) {
                int anagramHashCode = sortString(s.substring(anagramStart, anagramStart + wordLength)).hashCode();
                if (currentWordHashCode == anagramHashCode) {
                    anagramsCount++;
                }
            }
        }

        return anagramsCount;
    }

    static String sortString(String s) {
        return s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

