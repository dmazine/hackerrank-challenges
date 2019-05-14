/*
 * Sherlock and the Valid String
 *
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        final int[] charsFrequency = new int[26];

        s.chars().forEach(c -> charsFrequency[c - 97]++);

        final int[] frequencies = Arrays.stream(charsFrequency).filter(n -> n > 0).sorted().toArray();

        if ((frequencies[0] == frequencies[frequencies.length - 1])
            || (frequencies[0] == 1 && (frequencies[1] == frequencies[frequencies.length - 1]))
            || ((frequencies[0] == frequencies[frequencies.length - 2])
                && (frequencies[frequencies.length - 1] - frequencies[frequencies.length - 2] == 1))) {
            return "YES";
        }

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
