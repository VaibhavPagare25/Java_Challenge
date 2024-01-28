
class Solution {

    public static int smallestSubWithSum(int[] a, int n, int x) {

        int index = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];

            while (sum > x) {
                count = Math.min(count, i - index + 1);
                sum = sum - a[index++];
            }
        }

        if(count == Integer.MAX_VALUE){
            return 0;
        }else{
            return count;
        }
    }
}

