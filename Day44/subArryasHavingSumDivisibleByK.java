
import java.util.*;
import java.io.*;

public class Solution {

    public static int subArrayCount(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int result = 0;
        int prefixSum = 0;

        int[] remainderCount = new int[k];
        remainderCount[0] = 1;

        for (int i = 0; i < n; i++) {
            prefixSum = (prefixSum + arr.get(i)) % k;
            if (prefixSum < 0) {
                prefixSum += k;
            }

            result += remainderCount[prefixSum];
            remainderCount[prefixSum]++;
        }

        return result;
    }
}
