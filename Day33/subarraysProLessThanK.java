
class Solution {

    public long countSubArrayProductLessThanK(long a[], int n, long k) {
        if (k <= 1) {
            return 0;
        }

        long count = 0;
        long product = 1;
        int left = 0;

        for (int right = 0; right < n; right++) {
            product *= a[right];

            while (product >= k) {
                product /= a[left];
                left++;
            }
            count += (right - left + 1);
        }

        return count;
    }
}

