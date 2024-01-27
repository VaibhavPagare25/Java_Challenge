
import java.util.*;
class Solution{

	int[] plusOne(int[] arr){

		int temp = 0;
		int count = 0;
		for(int i = 0; i<arr.length; i++){
	
			temp = temp * 10 + arr[i];
		}

		int temp1 = temp+1;
		int temp2 = temp1;
		while(temp1 != 0){

			count++;
			temp1 = temp1/10;
		}

		int result[] = new int[count];
		for(int j = result.length-1; j>=0; j--){

			result[j] = temp2%10;
			temp2 = temp2/10;
		}

		return result;

	}

	public static void main(String[] args){

		Solution obj = new Solution();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of an Array");
		int nums[] = new int[size];

		for(int i = 0; i < size;i++) {

			nums[i] = sc.nextInt();
		}

		int[] ret = obj.plusOne(nums);
		for(int i = 0; i<ret.length; i++){
			System.out.println(ret[i]);
		}
	}
}
