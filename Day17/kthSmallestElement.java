
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);
        int min = 0;
        for(int i = 0; i<k; i++){
            min = arr[i];
        }
        return min;
    }
}
