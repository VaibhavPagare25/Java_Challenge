
class Solution {

    public static int longest(int arr[],int n) {

        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<leftMax[i-1])
                leftMax[i] = leftMax[i-1];
            else
                leftMax[i] = arr[i];
        }
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]>=leftMax[i])
                count++;
        }
        return count;
    }
}
