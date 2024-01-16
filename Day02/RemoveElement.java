
class RemoveElement {

    public int logic(int[] nums, int val) {

        int temp[] = new int[nums.length];
        int cnt = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] != val){
                temp[cnt] = nums[i];
                cnt++;
            }

        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = temp[i];
        }
        return cnt;
    }
}
