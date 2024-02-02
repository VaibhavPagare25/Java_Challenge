
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int right[] = new int[n];
        int left[] = new int[n];
        int mult[] = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        //for product of left array
        for(int i = 1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        } 

        //for product of right array
        for(int j = n-2; j>=0; j--){
            right[j] = right[j+1] * nums[j+1];
        }

        //product of left array and right array
        for(int k = 0; k<n; k++){
            mult[k] = left[k] * right[k];
        }
        return mult;
    }
}
