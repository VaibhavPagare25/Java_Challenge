
import java.util.ArrayList;

public class Solution {
    public static int maximizeScore(ArrayList<Integer> arr, int n, int k) {
        int score = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(0) > arr.get(n - 1)) {
                score += arr.get(0);
                arr.remove(0);
                n--;
            } else {
                score += arr.get(n - 1);
                arr.remove(n - 1);
                n--;
            }
        }
        return score;
    }
}

