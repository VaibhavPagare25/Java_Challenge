
/*
Code 03: KeyPair
given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
*/

import java.util.*;
class KeyPair{

	public static boolean logic(int arr[], int n, int x){
		
		for(int i = 0; i < n; i++){
			
			for(int j = i+1; j < n; j++){
				
				int sum = 0;
				sum = arr[i] + arr[j];
				if(sum == x){
		
					return true;
				}	
			}
		}
		return false;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
          	System.out.println("Enter the size of an Array");
           	int size = sc.nextInt();

           	System.out.println("Enter the elements of Array");
           	int arr[] = new int[size];

           	for(int i = 0; i<arr.length; i++){

                        arr[i] = sc.nextInt();

           	}

		System.out.println("Enter Sum of two elements");
		int x = sc.nextInt();

           	boolean result = logic(arr,size,x);

           	System.out.println(result);
	}
}
