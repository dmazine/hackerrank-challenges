/*
 * Fraudulent Activity Notifications challenge.
 *
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public Solution() {
    }

    // Complete the activityNotifications function below.

    private static final int MAX_EXPENDITURE = 201;

    static int activityNotifications(int[] expenditures, int numberOfDays) {
        int notificationsCount = 0;

        // Use the Counting Sort algorithm to sort the expenditures in order to calculate the median spending
        // See https://www.geeksforgeeks.org/counting-sort/
        int[] expendituresFrequencies = new int[MAX_EXPENDITURE + 1];

        for (int i = 0; i < numberOfDays; i++) {
            expendituresFrequencies[expenditures[i]]++;
        }

        for (int i = numberOfDays; i < expenditures.length; i++) {
            if (expenditures[i] >= 2 * calculateMedianSpending(expendituresFrequencies, numberOfDays)) {
                notificationsCount++;
            }

            expendituresFrequencies[expenditures[i - numberOfDays]]--;
            expendituresFrequencies[expenditures[i]]++;
        }

        return notificationsCount;
    }

    private static double calculateMedianSpending(int[] expendituresFrequencies, int numberOfDays) {
        if (numberOfDays % 2 == 0) {
            int middle = (numberOfDays / 2);

            return (getValueAtPosition(expendituresFrequencies, middle)
                    + getValueAtPosition(expendituresFrequencies, middle + 1)) / 2.0;
        } else {
            int middle = ((numberOfDays + 1) / 2);

            return getValueAtPosition(expendituresFrequencies, middle);
        }
    }

    private static int getValueAtPosition(int[] expendituresFrequencies, int position) {
        int offset = 0;

        for (int i = 0; i < expendituresFrequencies.length; i++) {
            offset += expendituresFrequencies[i];

            if (offset >= position) {
                return i;
            }
        }

        return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
