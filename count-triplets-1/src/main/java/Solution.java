import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Count Triplets challenge.
 *
 * @see <a href="https://www.hackerrank.com/challenges/count-triplets-1/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps">Count Triplets</a>
 */
public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> items, long ratio) {
        Map<Long, Long> v2 = new HashMap<>();
        Map<Long, Long> v3 = new HashMap<>();

        long count = 0;

        for (Long item : items) {
            if (v3.containsKey(item)) {
                count += v3.get(item);
            }

            if (v2.containsKey(item)) {
                v3.compute(item * ratio, (key, value) -> value == null ? v2.get(item) : v2.get(item) + value);
            }

            v2.compute(item * ratio, (key, value) -> value == null ? 1 : value + 1);
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
