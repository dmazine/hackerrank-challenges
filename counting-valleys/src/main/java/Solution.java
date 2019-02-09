import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Counting Valleys challenge solution.
 *
 * @see <a href="https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup">Counting Valleys</a>
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level = 0;
        int numberOfValleys = 0;

        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'U':
                    if (++level == 0) {
                        numberOfValleys++;
                    }
                    break;

                case 'D':
                    level--;
                    break;
            }
        }

        return numberOfValleys;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
