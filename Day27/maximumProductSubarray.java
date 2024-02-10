
class Solution {
    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            int prod = 1;
            for(int j = i; j<nums.length; j++){
                prod = prod * nums[j];
                if(prod > max){
                    max = prod;
                }
            }
        }
        return max;
    }
}
