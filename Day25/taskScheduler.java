
public class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] cArray = new int[26];
        for(char t : tasks){
            cArray[t - 'A']++;
        }
        Arrays.sort(cArray);
        int i = 25;
        while(i >= 0 && cArray[i] == cArray[25]) i--;

        return Math.max(tasks.length, (cArray[25] - 1) * (n + 1) + 25 - i);
    }
}
