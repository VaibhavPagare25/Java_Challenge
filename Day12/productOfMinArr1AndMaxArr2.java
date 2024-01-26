
class Solution{ 

    public static long find_multiplication (int arr1[], int arr2[], int n, int m) {

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j<m; j++){
            if(arr2[j] < min){
                min = arr2[j];
            }
        }

        long result = max * min;
        return result;
    }
}
