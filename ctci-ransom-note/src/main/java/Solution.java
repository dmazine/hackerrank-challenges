/*
 * Hash Tables: Ransom Note challenge solution.
 *
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the checkMagazine function below.
    private static class WordsBag {
        private Map<String, Integer> words = new HashMap<String, Integer>();

        public WordsBag(String[] words) {
            addAll(words);
        }

        public void addAll(String[] words) {
            for (String word : words) {
                add(word);
            }
        }

        public void add(String word) {
            final Integer count = words.get(word);
            if (count == null) {
                words.put(word, 1);
            } else {
                words.put(word, count + 1);
            }
        }

        public boolean remove(String word) {
            final Integer count = words.get(word);
            if ((count == null) || (count == 0)) {
                return false;
            }

            words.put(word, count - 1);
            return true;
        }

    }

    static void checkMagazine(String[] magazine, String[] note) {
        final boolean result = containsAllWords(magazine, note);
        System.out.println(result ? "Yes" : "No");
    }

    static boolean containsAllWords(String[] magazine, String[] note) {
        final WordsBag wordsBag = new WordsBag(magazine);

        for (String word : note) {
            if (!wordsBag.remove(word)) {
                return false;
            }
        }

        return true;
    }

    static Map<String, Integer> buildWordsMap(String[] magazine) {
        final Map<String, Integer> words = new HashMap<>();
        for (String word : magazine) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }

        return words;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
