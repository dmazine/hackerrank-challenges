/*
 * Merge Sort: Counting Inversions
 *
 * https://www.hackerrank.com/challenges/ctci-merge-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length);
    }

    private static long mergeSort(int[] arr, int startIndex, int endIndex) {
        if (endIndex - startIndex == 1) {
            return 0;
        }

        final int mediumIndex = (startIndex + endIndex) / 2;

        long inversionsCount = mergeSort(arr, startIndex, mediumIndex)
                + mergeSort(arr, mediumIndex, endIndex)
                + sort(arr, startIndex, mediumIndex, endIndex);

        return inversionsCount;
    }

    private static long sort(int[] arr, int startIndex, int mediumIndex, int endIndex) {
        final int[] sortedArr = new int[endIndex - startIndex];
        int sortedIndex = 0;

        int leftIndex = startIndex;
        int rightIndex = mediumIndex;

        long inversionsCount = 0;

        while (leftIndex < mediumIndex && rightIndex < endIndex) {
            if (arr[leftIndex] <= arr[rightIndex]) {
                sortedArr[sortedIndex++] = arr[leftIndex++];
            } else {
                sortedArr[sortedIndex++] = arr[rightIndex++];
                inversionsCount += mediumIndex - leftIndex;
            }
        }

        while (leftIndex < mediumIndex) {
            sortedArr[sortedIndex++] = arr[leftIndex++];
        }

        while (rightIndex < endIndex) {
            sortedArr[sortedIndex++] = arr[rightIndex++];
        }

        System.arraycopy(sortedArr, 0, arr, startIndex, sortedArr.length);

        return inversionsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            long result = countInversions(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
