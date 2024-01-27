
class Solution {
    public int countQuadruplets(int[] arr) {

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    for(int l =k+1; l<arr.length; l++){
                        if(arr[i]+arr[j]+arr[k] == arr[l]){
                            count++;
                        }
                    }
                }
            }
        }
        if(count == 0){
            return 0;
        }
        else{
            return count;
        }
    }
}
