
class Solution {
    public long zeroFilledSubarray(int[] arr) {
        long count = 0;
        long sum = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
            else{
                count = 0;
            }
            sum = sum + count;
        }
        return sum;
    }
}
