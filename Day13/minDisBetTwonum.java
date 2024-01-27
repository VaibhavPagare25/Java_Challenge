
//brute force
class Solution {
    int minDist(int arr[], int n, int x, int y) {
        

        int distance = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==x && arr[j]==y || arr[i]==y && arr[j]==x){
                    distance = j - i;
                    if(distance < min){
                        min = distance;
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
