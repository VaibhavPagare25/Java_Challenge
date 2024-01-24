
import java.util.*;
class Solution {

	int[] squareOfSortedArray(int arr[]){
		
		for(int i = 0; i<arr.length; i++){
		
			arr[i] = arr[i] * arr[i];
		}

		Arrays.sort(arr);

		return arr;	
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Solution obj = new Solution();

		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();

		System.out.println("Enter the elements of an Array");
		int arr[] = new int[size];
		for(int i = 0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
		}

		int[]  result = obj.squareOfSortedArray(arr);

		for(int i = 0; i<arr.length; i++){

			System.out.print(result[i]);

			if(i < arr.length-1){
				System.out.print(",");
			}
		}

		
	}
}
