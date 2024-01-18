
import java.util.*;

class Solution {

    static void reArrange(int[] arr, int n) {
        int arr1[] = new int[n];

        int temp1 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                arr1[temp1] = arr[i];
                temp1 = temp1 + 2;
            }
        }

        int temp2 = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 1){
                arr1[temp2] = arr[i];
                temp2 = temp2 + 2;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = arr1[i];
        }
    }
};

class EvenAndOdd{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Solution obj = new Solution();

		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0;i < n;i++){

			arr[i] = sc.nextInt();
		}

		obj.reArrange(arr,n);
	}
}

