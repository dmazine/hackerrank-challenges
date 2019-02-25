import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Array Manipulation challenge solution.
 *
 * @see <a href="https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays">Array Manipulation</a>
 * @see <a href="https://stackoverflow.com/questions/48162233/logic-used-behind-array-manipulation-of-hackerrank">Logic used behind Array Manipulation of HackerRank</a>
 */
public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        final int[] deltas = new int[n + 2];

        for (int i = 0; i < queries.length; i++) {
            int leftIndex = queries[i][0];
            int rightIndex = queries[i][1];
            int summand = queries[i][2];

            deltas[leftIndex - 1] += summand;
            deltas[rightIndex] -= summand;
        }

        return findMaximumValue(deltas);
    }

    static long findMaximumValue(int[] deltas) {
        long value = 0;
        long maximumValue = Long.MIN_VALUE;

        for (int i = 0; i < deltas.length; i++) {
            value += deltas[i];
            if (value > maximumValue) {
                maximumValue = value;
            }
        }

        return maximumValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}