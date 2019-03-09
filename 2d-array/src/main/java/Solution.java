/*
 * 2D Array - DS challenge solution.
 *
 * @see @see <a href="https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays">2D Array - DS</a>
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int largestSum = Integer.MIN_VALUE;

        for (int row = 1; row < arr.length - 1; row++) {
            for (int col = 1; col < arr.length - 1; col++) {
                int sum = getHourglassSum(arr, row, col);
                if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }
        return largestSum;
    }

    private static int getHourglassSum(int[][] arr, int row, int col) {
        return arr[row - 1][col - 1] + arr[row - 1][col] + arr[row - 1][col + 1]
                + arr[row][col]
                + arr[row + 1][col - 1] + arr[row + 1][col] + arr[row + 1][col + 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

