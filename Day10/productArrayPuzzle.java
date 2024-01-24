
import java.util.*;
class Solution{
	
	int[] productArrayPuzzle(int arr[]){

		int arr1[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++){

			int mult = 1;
			for(int j = 0; j<arr.length; j++){

				if( i != j){

					mult = mult * arr[j];
				}
			}	
			arr1[i] = mult;
		}
		return arr1;	
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

                int[]  result = obj.productArrayPuzzle(arr);

                for(int i = 0; i<arr.length; i++){

			System.out.println(result[i]);
		}

	
	}
}
