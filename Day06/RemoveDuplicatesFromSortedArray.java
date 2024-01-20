
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

     int index = 0;

     int arr[] = new int[nums.length];

     for(int i = 0; i < nums.length-1;i++){

            if(nums[i] != nums[i+1]){
                arr[index] = nums[i];
                index++;
            }
     }

     arr[index++] = nums[nums.length-1];

     for(int i = 0; i < nums.length;i++){
         nums[i] = arr[i];
     }
     return index;
    }
}


class Client{

	public static void main(String[] args){

		Solution obj = new Solution();

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int nums[] = new int[size];

		for(int i = 0; i < size;i++){

			nums[i] = sc.nextInt();
		}
		int ret = obj.removeDuplicates(nums);
		System.out.println(ret);
	}
}

