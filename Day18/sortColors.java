

class Solution {
    public void sortColors(int[] arr) {
        int l = 0;
        int m = 0;
        int h = arr.length-1;

        while(m <= h){
            if(arr[m] == 0){
                swap(arr, l, m);
                l++;
                m++;
            }
            else if(arr[m] == 2){
                swap(arr, m, h);
                h--;
            }
            else{
                m++;
            }
        }
    }
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
