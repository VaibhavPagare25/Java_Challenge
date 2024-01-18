
import java.util.*;
class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int res = 0;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else {
                cnt = 0;
            }
            if(cnt!=0){
                res = cnt;
                if(res>max){
                    max = res;
                }
            }
        }
        return max;
    }
}

class MaxOnes{

	public static void main(String[] args){

		Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i = 0 ; i < size;i++){

			arr[i] = sc.nextInt();
		}

		int ret = obj.findMaxConsecutiveOnes(arr);
		System.out.println(ret);

	}
}

