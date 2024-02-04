
class Solution{
    int findMaxDiff(int arr[], int n){

	    int smallLeft[] = new int[n];
	    int smallRight[] = new int[n];


	    for(int i = 1; i < n; i++){
	        for(int j = 0; j < i; j++){
	            if(arr[j] < arr[i]){
	                smallLeft[i] = arr[j];
	            }
	        }
	    }

	    for(int i = n-2;i >= 0;i--){
	        for(int j = n-1;j >= i; j--){
	            if(arr[i] > arr[j]){
	                smallRight[i] = arr[j];
	            }
	        }
	    }


	    int diff[] = new int[n];
	    for(int i = 0; i < n; i++){

	        diff[i] = Math.abs(smallLeft[i] - smallRight[i]);

	    }

	    int max = Integer.MIN_VALUE;

	    for(int i = 0; i < diff.length; i++){
	        if(max < diff[i]){
	            max = diff[i];
	        }
	    }


	    return max;

    }
}
