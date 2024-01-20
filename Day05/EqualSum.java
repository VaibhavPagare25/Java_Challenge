
class Solution{
	int equalSum(int [] arr, int n) {
		// prefix Array
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];

        for(int i=1;i<n;i++){
            prefixSum[i] =  prefixSum[i-1] + arr[i];
        }

        // suffix Array
        int[] suffixSum = new int[n];
        suffixSum[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--){
            suffixSum[i] = suffixSum[i+1] + arr[i];
        }

        for(int i=0;i<n;i++){
            if(prefixSum[i] == suffixSum[i])
                return i+1;
        }

        return -1;
	}
}
