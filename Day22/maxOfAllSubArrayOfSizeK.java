
class Solution
{
 
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
	ArrayList<Integer> aList = new ArrayList<Integer>();
        for(int i = 0; i<=n-k; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i; j<i+k; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            aList.add(max);
        }
        return aList;
    }
}
