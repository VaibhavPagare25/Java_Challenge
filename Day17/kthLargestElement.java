
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        for(int i = nums.length-1; i >= nums.length-k; i--){
            max = nums[i];
        }
        return max;
    }
}
