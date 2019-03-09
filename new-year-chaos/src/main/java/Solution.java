/*
 * New Year Chaos challenge solution.
 *
 * @see <a href="https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays">New Year Chaos</a>
 */

import java.util.Scanner;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        final int result = findNumberOfBribes(q);
        System.out.println(result == -1 ? "Too chaotic" : result);
    }

    static int findNumberOfBribes(int[] queue) {
        int numberOfBribes = 0;

        for (int i = queue.length; i > 0; i--) {
            if (queue[i - 1] == i) {
                continue;
            } else  if (i >= 2 && queue[i - 2] == i) {
                moveRight(queue, i - 2, 1);
                numberOfBribes++;
            } else  if (i >= 3 && queue[i - 3] == i) {
                moveRight(queue, i - 3, 2);
                numberOfBribes += 2;
            } else {
                return -1;
            }
        }

        return numberOfBribes;
    }

    static void moveRight(int[] queue, int person, int numberOfPositions) {
        for (int i = 0; i < numberOfPositions; i++) {
            swap(queue, person + i, person + i + 1);
        }
    }

    static void swap(int[] queue, int from, int to) {
        final int t = queue[from];
        queue[from] = queue[to];
        queue[to] = t;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
