
/*Code 02: First Repeating Element
 * Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
 * Note- The position you return should be according to 1 based indexing.
 */

import java.util.*;
class FindRepeatingElement {

	int solution(int arr[], int n){

		for(int i = 0; i<arr.length; i++){

			int count = 0;		
			for(int j = 0; j<arr.length; j++){

				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count >= 2){
				return i+1;
			}

		}
		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		FindRepeatingElement obj = new FindRepeatingElement();
		
		
                System.out.println("Enter the size of an Array");
                int size = sc.nextInt();
                System.out.println("Enter the elements of Array");
                int arr[] = new int[size];

                for(int i = 0; i<arr.length; i++){

                        arr[i] = sc.nextInt();
                
		}

		//int n = sc.nextInt();

                int result = obj.solution(arr, size);

                System.out.println("First Repeating Element Index is: " + result);


	}
}
