/*
 * Bubble Sort challenge.
 *
 * https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */

import java.util.Scanner;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        final int[] result = sort(a);

        System.out.println(String.format("Array is sorted in %d swaps.", result[0]));
        System.out.println(String.format("First Element: %d", result[1]));
        System.out.println(String.format("Last Element: %d", result[2]));
    }

    static int[] sort(int[] a) {
        int swapsCount = 0;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapsCount++;
                }
            }
        }

        return new int[]{
                swapsCount,
                a[0],
                a[a.length - 1]
        };
    }

    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
