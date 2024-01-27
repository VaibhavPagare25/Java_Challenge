
class Solution {
    int minDist(int arr[], int n, int x, int y) {

        int index1 = -1;
        int index2 = -1;
        int distance = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){

            if(arr[i] == x){
                index1 = i;
            }
            if(arr[i] == y){
                index2 = i;
            }

            if(index1 != -1 && index2!= -1){
                if(index1 > index2){
                    distance = index1 - index2;
                }
                else{
                    distance = index2 - index1;
                }
                if(distance < min){
                    min = distance;
                }
            }
        }
        if(index1 == -1 || index2 == -1){
            return -1;
        }
        else{
            return min;
        }
    }
}
