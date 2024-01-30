
class Solution {
    int binarysearch(int arr[], int n, int k) {

        int first = 0;
        int last = arr.length-1;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < k ){
                first = mid + 1;
            }else if ( arr[mid] == k){
                return mid;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
   }
}
