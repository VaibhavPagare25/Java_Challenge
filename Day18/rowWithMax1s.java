
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[] = new int[2];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<mat.length; i++){
            int count = 0;
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > max){
                max = count;
                arr[0] = i;
                arr[1] = max;
            }
        }
        return arr;
    }
}
