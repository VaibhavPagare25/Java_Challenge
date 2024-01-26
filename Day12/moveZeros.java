
import java.util.*;
class Solution {

	int[] moveZeros(int arr[]){
	
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] != 0){
				arr[count] = arr[i];
				count++;
			}
		}
		while(count < arr.length){
			arr[count] = 0;
			count++;
		}
		return arr;
	}

	public static void main(String[] args){

		Solution obj = new Solution();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		System.out.println("Enter the elements of an array");
		int nums[] = new int[size];

		for(int i = 0; i < size;i++) { 

			nums[i] = sc.nextInt();
		}

		int[] ret = obj.moveZeros(nums);

		for(int i = 0; i<nums.length; i++){

			System.out.print(ret[i]);
		}
	}
}
