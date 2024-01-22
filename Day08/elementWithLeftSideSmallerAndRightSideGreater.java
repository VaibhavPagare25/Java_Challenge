
class Compute {
    public int findElement(int arr[], int n){
 
        int[] leftBig = new int[n];
        leftBig[0] = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>leftBig[i-1])
                leftBig[i] = arr[i];
            else
                leftBig[i] = leftBig[i-1];
        }

 
        int[] rightSmall = new int[n];
        rightSmall[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]<rightSmall[i+1])
                rightSmall[i] = arr[i];
            else
                rightSmall[i] = rightSmall[i+1];
        }
        for(int i=1;i<n-1;i++){
            if(leftBig[i-1]<=arr[i] && rightSmall[i+1]>=arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}
