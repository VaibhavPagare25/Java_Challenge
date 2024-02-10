
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        int[] result = new int[n+m];
        for(int i = 0; i<n; i++){
            result[i] = arr1[i];
        }
        for(int i = n; i<result.length; i++){
            result[i] = arr2[i-n];
        }

        Arrays.sort(result);
        int  finalNum = result[k-1];
        return finalNum;
    }
}
