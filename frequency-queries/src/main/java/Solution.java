/*
 * Frequency Queries challenge.
 *
 * https://www.hackerrank.com/challenges/frequency-queries/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class Solution {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(int[][] queries) {
        final Map<Integer, Integer> elementsCount = new HashMap<>();
        final Map<Integer, Integer> frequenciesCount = new HashMap<>();

        final List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            final int operation = query[0];
            final int operand = query[1];

            switch (operation) {
                case 1: {
                    Integer count = elementsCount.get(operand);
                    if (count == null) {
                        count = 0;
                    }

                    elementsCount.put(operand, count + 1);

                    frequenciesCount.compute(count, (key, value) -> value == null ? 0 : value - 1);
                    frequenciesCount.compute(count + 1, (key, value) -> value == null ? 1 : value + 1);
                }
                break;

                case 2: {
                    Integer count = elementsCount.get(operand);
                    if (count == null) {
                        count = 0;
                    }

                    if (count > 0) {
                        elementsCount.put(operand, count - 1);

                        frequenciesCount.compute(count, (key, value) -> value == null ? 0 : value - 1);
                        frequenciesCount.compute(count - 1, (key, value) -> value == null ? 1 : value + 1);
                    }
                }
                break;

                case 3: {
                    Integer count = frequenciesCount.get(operand);
                    if (count == null) {
                        count = 0;
                    }

                    result.add(count > 0 ? 1 : 0);
                }
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        Pattern queryPattern = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        int[][] queries = new int[q][];

        IntStream.range(0, q).forEach(i -> {
            try {
                final Matcher matcher = queryPattern.matcher(bufferedReader.readLine());
                if (matcher.matches()) {
                    queries[i] = new int[2];
                    queries[i][0] = Integer.parseInt(matcher.group(1));
                    queries[i][1] = Integer.parseInt(matcher.group(2));
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
