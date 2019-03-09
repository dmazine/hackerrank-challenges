/*
 * Sorting: Comparator challenge.
 *
 * @see <a href="https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting">Sorting: Comparator</a>
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        return a.score == b.score ? a.name.compareTo(b.name) : b.score - a.score;
    }

    public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            Player[] player = new Player[n];
            Checker checker = new Checker();

            for (int i = 0; i < n; i++) {
                player[i] = new Player(scan.next(), scan.nextInt());
            }
            scan.close();

            Arrays.sort(player, checker);
            for (int i = 0; i < player.length; i++) {
                System.out.printf("%s %s\n", player[i].name, player[i].score);
            }
        }

    }
