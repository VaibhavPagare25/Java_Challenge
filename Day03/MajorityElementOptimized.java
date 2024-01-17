
import java.util.*;
class Solution {

    public int majorityElement(int[] nums) {

     Arrays.sort(nums);

     int length = nums.length;

     int ans = nums[(length/2)];

     return ans;
    }
}

class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int arr[]= new int[size];
		System.out.println("Enter the elements of an array");

		for(int i = 0; i < size;i++){

			arr[i] = sc.nextInt();
		}
		Solution obj = new Solution();

		int ret = obj.majorityElement(arr);

		System.out.println("Majority element is:" + ret);
	}
}

