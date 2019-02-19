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
            int position = findPerson(queue, i);

            int distance = i - 1 - position;
            if (distance > 2) {
                return -1;
            }

            moveBack(queue, position, distance);
            numberOfBribes += distance;
        }

        return numberOfBribes;
    }

    static int findPerson(int[] queue, int person) {
        for (int i = person - 1; i >= 0; i--) {
            if (queue[i] == person) {
                return i;
            }
        }

        return -1;
    }

    static void moveBack(int[] queue, int person, int numberOfPositions) {
        for (int i = 0; i < numberOfPositions; i++) {
            swap(queue, person + i, person + i + 1);
        }
    }

    static void swap(int[] queue, int from, int to) {
        final int t = queue[from];
        queue[from] = queue[to];
        queue[to] = from;
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
