
class Solution {
    static int findPlatform(int arr[], int dep[], int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1, result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            }
            else if (arr[i] > dep[j]) {
                platforms--;
                j++;
            }

            if (platforms > result) {
                result = platforms;
            }
        }
        return result;
    }
}
