
import java.util.*;

class Solution {

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int max1 = nums[0] * nums[1] * nums[nums.length-1];
        int max2 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

        if(max1 < max2) {
            return max2;
        }
	else {
            return max1;
        }
    }
}

class Client {

	public static void main(String[] args){

		Solution obj = new Solution();

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int nums[] = new int[size];

		for(int i = 0; i < size;i++) { 

			nums[i] = sc.nextInt();
		}

		int ret = obj.maximumProduct(nums);
		System.out.println(ret);
	}
}

