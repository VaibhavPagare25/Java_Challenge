
import java.util.*;
class Solution {

	int sumEqualsK(int arr[], int key){
		
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			for(int j = i; j<arr.length; j++){
				
				int sum = 0;
				for(int k = i; k<=j; k++){
				
					sum = sum + arr[k];
				}
				if(sum == key){
					count++;
				}

			}
		}
		return count;
	}

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		Solution obj = new Solution();
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter  the elements of an array");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the K");
		int k = sc.nextInt();

		int result = obj.sumEqualsK(arr,k);
		System.out.println(result);

	}
}
